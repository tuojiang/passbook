package com.chandler.passbook.constant;

/**
 * @Date: 19-5-9
 * @version： V1.0
 * @Author: Chandler
 * @Description: 评论的枚举类型
 */
public enum FeedbackType {

    PASS("pass","针对优惠券的评论"),
    APP("app","针对卡包 App 的评论");

    /** 评论类型编码 */
    private String code;

    /** 评论类型描述 */
    private String desc;

    FeedbackType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
