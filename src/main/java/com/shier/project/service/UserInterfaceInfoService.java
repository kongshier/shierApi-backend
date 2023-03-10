package com.shier.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shier.shiercommon.model.entity.UserInterfaceInfo;

/**
 * @author Shier
 * @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
 * @createDate 2023-02-15 13:12:25
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId,long userId);
}
