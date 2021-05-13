package com.gateway.config;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

public class CustomFilter extends AbstractGatewayFilterFactory<CustomFilter.Config> {
	
	
	public static class Config {
		// Put the configuration properties
	}

	@Override
	public GatewayFilter apply(Config config) {
		// TODO Auto-generated method stub
		return null;
	}

}
