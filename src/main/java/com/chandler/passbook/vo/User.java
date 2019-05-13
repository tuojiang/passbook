package com.chandler.passbook.vo;

import com.sun.imageio.plugins.common.I18N;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 19-5-10
 * @version： V1.0
 * @Author: Chandler
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /** 用户 id */
    private Long id;

    /** 用户基本信息 */
    private BaseInfo baseInfo;

    /** 用户额外信息 */
    private OtherInfo otherInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BaseInfo {

        private String name;
        private Integer age;
        private String sex;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherInfo {
        private String phone;
        private String address;
    }

}