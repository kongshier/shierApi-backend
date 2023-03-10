package com.shier.project.rpc.impl;

import com.shier.project.rpc.RpcDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * 实现接口
 */
@DubboService
public class RpcDemoServiceImpl implements RpcDemoService {
	@Override
	public String sayHello(String name) {
		System.out.println(" Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
		return "Hello " + name;
	}
}