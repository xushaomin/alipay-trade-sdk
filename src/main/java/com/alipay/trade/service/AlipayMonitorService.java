package com.alipay.trade.service;

import com.alipay.api.response.MonitorHeartbeatSynResponse;
import com.alipay.trade.model.builder.AlipayHeartbeatSynContentBuilder;

public abstract interface AlipayMonitorService {
	
	public abstract MonitorHeartbeatSynResponse heartbeatSyn(
			AlipayHeartbeatSynContentBuilder paramAlipayHeartbeatSynContentBuilder);

	public abstract MonitorHeartbeatSynResponse heartbeatSyn(
			AlipayHeartbeatSynContentBuilder paramAlipayHeartbeatSynContentBuilder, String paramString);
}