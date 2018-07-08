package com.miao.boot.bpm.editor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACT_RE_MODEL")
public class ActReModel {

	@Id
	@Column(name = "ID_")
	private Long id;
	
	@Column(name = "KEY_")
	private String processKey;
	
}
