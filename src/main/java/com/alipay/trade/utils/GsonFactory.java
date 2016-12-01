package com.alipay.trade.utils;

import java.lang.reflect.Type;

import com.alipay.trade.model.hb.EquipStatus;
import com.alipay.trade.model.hb.EquipStatusAdapter;
import com.alipay.trade.model.hb.ExceptionInfoAdapter;
import com.alipay.trade.model.hb.TradeInfoAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonFactory {
	
	public static Gson getGson() {
		return GsonHolder.gson;
	}

	@SuppressWarnings("rawtypes")
	private static class GsonHolder {
		private static Type exceptionListType = new TypeToken() {}.getType();
		private static Type tradeInfoListType = new TypeToken() {}.getType();

		private static Gson gson = new GsonBuilder().registerTypeAdapter(exceptionListType, new ExceptionInfoAdapter())
				.registerTypeAdapter(tradeInfoListType, new TradeInfoAdapter())
				.registerTypeAdapter(EquipStatus.class, new EquipStatusAdapter()).create();
	}
}