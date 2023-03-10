package com.shier.shiercommon.service;

import com.shier.shiercommon.model.entity.User;

public interface InnerUserService {

    /**
     * 根据accessKey查询用户
     * @param accessKey accessKey
     * @return User
     */
    User getInvokeUser(String accessKey);
}