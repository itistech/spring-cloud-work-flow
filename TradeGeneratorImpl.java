
package com.itistech;

import java.util.ArrayList;
import java.util.List;

public class TradeGeneratorImpl {

	private static List<Trade> trades = new ArrayList<Trade>();

	public static List<Trade> getTrades(int noOfTrades) {

		for (int i = 0; i < noOfTrades; i++) {

			trades.add(new Trade(i, 3, "trade_type1", "trade_type1", "trade_type1", null, null, null, null, null, null,
					10));

			trades.add(new Trade(i, 4, "trade_type2", "trade_type2", "trade_type2", "trade_type2", null, null, null,
					null, null, 5000));

			trades.add(new Trade(i, 7, "trade_type3", "trade_type3", "trade_type3", "trade_type3", "trade_type3",
					"trade_type3", "trade_type3", null, null, 900));

			trades.add(new Trade(i, 8, "trade_type4", "trade_type4", "trade_type4", "trade_type4", "trade_type4",
					"trade_type4", "trade_type4", "trade_type4", null, 8000));

			// faulty trades

			trades.add(new Trade(i, 3, null, null, null, null, null, null, null, null, null, 10));

			trades.add(new Trade(i, 8, null, null, null, null, null, null, null, null, null, 8000));

		}

		return trades;
	}

	public static void main(String[] args) {
		for (Trade t : getTrades(300)) {
			System.out.println(t.toString());
		}
	}
}
