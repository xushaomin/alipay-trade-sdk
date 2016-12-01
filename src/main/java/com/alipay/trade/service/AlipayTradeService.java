package com.alipay.trade.service;

import com.alipay.trade.model.builder.AlipayTradePayContentBuilder;
import com.alipay.trade.model.builder.AlipayTradePrecreateContentBuilder;
import com.alipay.trade.model.builder.AlipayTradeRefundContentBuilder;
import com.alipay.trade.model.result.AlipayF2FPayResult;
import com.alipay.trade.model.result.AlipayF2FPrecreateResult;
import com.alipay.trade.model.result.AlipayF2FQueryResult;
import com.alipay.trade.model.result.AlipayF2FRefundResult;

public abstract interface AlipayTradeService {
	
	public abstract AlipayF2FPayResult tradePay(AlipayTradePayContentBuilder paramAlipayTradePayContentBuilder);

	public abstract AlipayF2FQueryResult queryTradeResult(String paramString);

	public abstract AlipayF2FRefundResult tradeRefund(AlipayTradeRefundContentBuilder paramAlipayTradeRefundContentBuilder);

	public abstract AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateContentBuilder paramAlipayTradePrecreateContentBuilder);
}