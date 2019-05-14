package com.chandler.passbook.vo;

import com.chandler.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 19-5-10
 * @version： V1.0
 * @Author: Chandler
 * @Description: 优惠券模板信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplateInfo {

    /** 优惠券模板 */
    private PassTemplate passTemplate;

    /** 优惠券对应商户 */
    private Merchants merchants;
}
