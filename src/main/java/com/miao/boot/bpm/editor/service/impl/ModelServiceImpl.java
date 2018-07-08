package com.miao.boot.bpm.editor.service.impl;

import java.util.List;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.miao.boot.bpm.commom.exception.BusinessException;
import com.miao.boot.bpm.commom.exception.WarningMessage;
import com.miao.boot.bpm.editor.controller.param.ModelCreateParam;
import com.miao.boot.bpm.editor.controller.param.ModelQueryParam;
import com.miao.boot.bpm.editor.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService {

	private @Autowired RepositoryService repositoryService;
	
	@Override
	public Long createModel(ModelCreateParam param) {
		Model checkModel = repositoryService.createModelQuery().modelKey(param.getProcessKey())
				.modelTenantId(param.getTenantId()).singleResult();
		if(checkModel == null) {
			throw new BusinessException(WarningMessage.PROCESS_EXIST);
		}
		Model model = repositoryService.newModel();
		
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
