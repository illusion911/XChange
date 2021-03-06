/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.kraken.dto.trade.results;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xeiam.xchange.kraken.dto.KrakenResult;
import com.xeiam.xchange.kraken.dto.trade.KrakenTrade;
import com.xeiam.xchange.kraken.dto.trade.results.KrakenTradeHistoryResult.KrakenTradeHistory;

public class KrakenTradeHistoryResult extends KrakenResult<KrakenTradeHistory> {

  public KrakenTradeHistoryResult(@JsonProperty("result") KrakenTradeHistory result, @JsonProperty("error") String[] error) {

    super(result, error);
  }

  public static class KrakenTradeHistory {

    private final Map<String, KrakenTrade> orders;
    private final int count;

    public KrakenTradeHistory(@JsonProperty("trades") Map<String, KrakenTrade> orders, @JsonProperty("count") int count) {

      this.orders = orders;
      this.count = count;
    }

    public Map<String, KrakenTrade> getTrades() {

      return orders;
    }

    public int getCount() {

      return count;
    }
  }
}
