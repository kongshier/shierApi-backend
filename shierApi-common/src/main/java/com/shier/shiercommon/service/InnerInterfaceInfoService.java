package com.shier.shiercommon.service;

import com.shier.shiercommon.model.entity.InterfaceInfo;

public interface InnerInterfaceInfoService {

    /**
     * 根据path、method查询接口信息
     * @param path 请求路径
     * @param method 请求方法
     * @return InterfaceInfo
     */
    InterfaceInfo getInterfaceInfo(String path, String method);
}