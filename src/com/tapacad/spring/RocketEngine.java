package com.tapacad.spring;

import org.springframework.stereotype.Component;

@Component("rocketEngine")
public class RocketEngine implements Engine {

	@Override
	public String getEngineDetail() {
		return "Rocket Engine gives good Performance";
	}

}
