package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

@Data
//@ToString @Data包含了toString, 可以compile后看
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;

}
