package com.alipay.trade.model.builder;

import com.alipay.trade.utils.GsonFactory;

public abstract class RequestBuilder {
	
	public abstract boolean validate();

	public String toJsonString() {
		return GsonFactory.getGson().toJson(this);
	}
}