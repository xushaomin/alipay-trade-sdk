package com.alipay.trade.model.hb;

public abstract interface TradeInfo {
	public abstract HbStatus getStatus();

	public abstract double getTimeConsume();
}