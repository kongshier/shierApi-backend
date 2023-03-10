package com.shier.project.model.vo;

import com.shier.shiercommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 接口调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}