package com.miao.boot.bpm.editor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miao.boot.bpm.editor.service.ModelService;

/**
 * 模型相关，包括
 * 1、新建空模型
 * 2、获取所有模型列表
 * 3、发布模型
 * 4、删除模型
 * @author 皮卡丘
 *
 */

@RestController
@RequestMapping("model")
public class ModelController {

	private @Autowired ModelService modelService;
	
	public void test() {
	}
	
	
}