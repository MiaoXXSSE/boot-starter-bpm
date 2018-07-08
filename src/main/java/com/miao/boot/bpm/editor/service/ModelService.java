package com.miao.boot.bpm.editor.service;

import java.util.List;

import org.activiti.engine.repository.Model;
import org.springframework.data.domain.Pageable;

import com.miao.boot.bpm.editor.controller.param.ModelCreateParam;
import com.miao.boot.bpm.editor.controller.param.ModelQueryParam;

public interface ModelService {

	/**
	 * 创建一个新的model
	 * @return modelId
	 */
	public Long createModel(ModelCreateParam param);

	/**
	 * 获取模型列表
	 * @param param
	 * @param pageable
	 * @return List<Model>
	 */
	public List<Model> getModelList(ModelQueryParam param, Pageable pageable);
	
	/**
	 * 根据流程modelId部署流程
	 * @throws 
	 * @param id
	 */
	public void deploy(Long modelId);
	
	/**
	 * 删除模型
	 * @param modelId
	 */
	public void delete(Long modelId);
}
