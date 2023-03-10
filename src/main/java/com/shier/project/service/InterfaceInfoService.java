package com.shier.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.shier.shiercommon.model.entity.InterfaceInfo;

/**
* @author Shier
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-02-14 14:33:26
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo,boolean add);
}
