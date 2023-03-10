package com.shier.shiercommon.service;

import com.shier.shiercommon.model.entity.UserInterfaceInfo;

/**
 * @author Shier
 * @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
 * @createDate 2023-02-15 13:12:25
 */
public interface InnerUserInterfaceInfoService{

    /**
     * 是否还有调用次数
     * @param userId 用户id
     * @param interfaceInfoId 接口id
     * @return boolean
     */
    boolean hasInvokeNum(long userId, long interfaceInfoId);


    /**
     * 根据userId、interfaceInfoId计数
     * @param userId 用户id
     * @param interfaceInfoId 接口id
     * @return boolean
     */
    boolean invokeCount(long interfaceInfoId,long userId);
}
