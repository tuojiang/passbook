package com.chandler.passbook.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

/**
 * @Date: 19-5-9
 * @version： V1.0
 * @Author: Chandler
 * @Description: 日志生成器
 */
@Slf4j
public class LogGenerator {

    /**
     * 生成 log
     * @param request {@link HttpServletRequest}
     * @param userId 用户 id
     * @param action 日志类型
     * @param info 日志信息
     */
    public static void getLong(HttpServletRequest request,Long userId,String action,Object info){
        log.info(
                JSON.toJSONString(
                        new LogObject(action,userId,System.currentTimeMillis(),request.getRemoteAddr(),info)
                )
        );
    }
}
