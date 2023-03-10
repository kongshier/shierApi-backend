package com.shier.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shier.shiercommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Shier
* @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Mapper
* @createDate 2023-02-15 13:12:25
* @Entity com.shier.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




