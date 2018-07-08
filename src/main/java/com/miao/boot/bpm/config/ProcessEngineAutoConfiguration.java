package com.miao.boot.bpm.config;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;

public class ProcessEngineAutoConfiguration implements ProcessEngineConfigurationConfigurer{

	@Override
	public void configure(SpringProcessEngineConfiguration config) {
		//自定义缓存
//		config.setProcessDefinitionCache(new CustomDeploymentCache<>());
	}

}
