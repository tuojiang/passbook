package com.chandler.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 19-5-9
 * @version： V1.0
 * @Author: Chandler
 * @Description: 统一的错误信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo<T> {

    /** 错误码 */
    public static final Integer ERROR = null;

    /** 特定错误码 */
    private Integer code;

    /** 错误信息 */
    private String message;

    /** 请求 Url */
    private String url;

    /** 请求返回特定的数据 */
    private T date;
}
