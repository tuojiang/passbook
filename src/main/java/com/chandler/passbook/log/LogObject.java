package com.chandler.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 19-5-9
 * @version： V1.0
 * @Author: Chandler
 * @Description: 日志对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {

    /** 日志动作类型 */
    private String action;

    /** 用户 id */
    private Long userId;

    /** 当前时间戳 */
    private Long tiemstamp;

    /** 客户端 IP */
    private String remoteIp;

    /** 日志信息 */
    private Object info = null;

}
