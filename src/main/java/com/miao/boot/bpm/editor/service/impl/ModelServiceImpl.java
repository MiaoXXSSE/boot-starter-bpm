package com.miao.boot.bpm.editor.service.impl;

import java.util.List;

import org.activiti.engine.repository.Model;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.miao.boot.bpm.editor.controller.param.ModelQueryParam;
import com.miao.boot.bpm.editor.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService {

	@Override
	public Long createModel() {
		return null;
	}

	@Override
	public List<Model> getModelList(ModelQueryParam param, Pageable pageable) {
		return null;
	}

	@Override
	public void deploy(Long modelId) {
		
	}

	@Override
	public void delete(Long modelId) {
		
	}

}
