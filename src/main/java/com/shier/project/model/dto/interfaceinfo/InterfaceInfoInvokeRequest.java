package com.shier.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 调用接口参数
 *
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 请求参数
	 */
	private String userRequestParams;
}