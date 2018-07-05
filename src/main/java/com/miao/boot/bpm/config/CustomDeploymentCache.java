package com.miao.boot.bpm.config;

import org.activiti.engine.impl.persistence.deploy.DeploymentCache;

public class CustomDeploymentCache<T> implements DeploymentCache<T> {

	@Override
	public void add(String id, T object) {
		
	}

	@Override
	public void clear() {
		
	}

	@Override
	public boolean contains(String id) {
		return false;
	}

	@Override
	public T get(String id) {
		return null;
	}

	@Override
	public void remove(String id) {
		
	}

}
