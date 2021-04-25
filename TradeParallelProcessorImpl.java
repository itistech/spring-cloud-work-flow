
package com.itistech;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TradeParallelProcessorImpl {

	private static int noOfDailyTradeFiles = 10;
	private static int transactionsPerFile = 100000;
	private static List<Trade> faultyTrades = new ArrayList<Trade>();
	private static int evenAmount = 0;
	private static int oddAmount = 0;
	private static int totalNoOfTradesProcessed = 0;

	private static long totalTimeToProcess;

	private static boolean validateTrade(Trade trade) {
		++totalNoOfTradesProcessed;

		if (trade.getNoOfSetAttribte() != 0) {
			if (trade.getAttribute1() != null && trade.getAttribute1() != null && trade.getAttribute1() != null) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

	private static void processEven(Trade t) {
		if (validateTrade(t)) {
			if (t.getAmount() > 1000)
				evenAmount = evenAmount + t.getAmount();
			else
				evenAmount = evenAmount + (t.getAmount() * 2) / 100;
		} else {
			faultyTrades.add(t);
		}
	}

	private static void processTradefile() {
		Instant start = Instant.now();
		TradeGeneratorImpl.getTrades(transactionsPerFile).stream().forEach(trade -> processEven(trade));
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		totalTimeToProcess = totalTimeToProcess + timeElapsed.toMillis();
	}

	public static void init() {

		int count = 0;

		while (count <= noOfDailyTradeFiles) {
			processTradefile();
			++count;
		}

		System.out.println(
				"\nAverage time to process each file = " + totalTimeToProcess / noOfDailyTradeFiles + " milliseconds");

		System.out.println(
				"\nNo of trades processed per milliseconds = " + (totalNoOfTradesProcessed) / totalTimeToProcess);

		System.out.println("\nTotal No Of Trades Processed count = " + totalNoOfTradesProcessed);

		System.out.println("\nFaulty Trade count = " + faultyTrades.size());
	}
	
	public static void main(String[] args) {
		TradeParallelProcessorImpl.init();
	}
}
