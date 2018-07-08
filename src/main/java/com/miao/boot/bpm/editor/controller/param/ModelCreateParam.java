package com.miao.boot.bpm.editor.controller.param;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class ModelCreateParam {

	private @NotEmpty String processKey;
	private @NotEmpty String tenantId;
}
