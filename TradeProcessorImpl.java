
package com.itistech;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TradeProcessorImpl {

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
		if (t.getAmount() > 1000)
			evenAmount = evenAmount + t.getAmount();
		else
			evenAmount = evenAmount + (t.getAmount() * 2) / 100;
	}

	private static void processOdd(Trade t) {
		if (t.getAmount() > 1000)
			oddAmount = oddAmount + t.getAmount();
		else
			oddAmount = oddAmount + (t.getAmount() * 2) / 100;
	}

	private static void processTradefile() {

		Instant start = Instant.now();

		for (Trade trade : TradeGeneratorImpl.getTrades(transactionsPerFile)) {
			if (validateTrade(trade)) {
				if (trade.getNoOfSetAttribte() % 2 == 0) {
					processEven(trade);
				} else {
					processOdd(trade);
				}
			} else {
				faultyTrades.add(trade);
			}
		}

		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		totalTimeToProcess = totalTimeToProcess + timeElapsed.toMillis();
	}

	private static void init() {

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
		TradeProcessorImpl.init();
	}
}
