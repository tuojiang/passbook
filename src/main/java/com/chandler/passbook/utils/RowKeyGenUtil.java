package com.chandler.passbook.utils;

import com.chandler.passbook.vo.Feedback;
import com.chandler.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Date: 19-5-13
 * @version： V1.0
 * @Author: Chandler
 * @Description: 生成器工具类
 */
@Slf4j
public class RowKeyGenUtil {

    /**
     * 根据提供的 PassTemplate 对象生成 RowKey
     * @param passTemplate {@link PassTemplate}
     * @return String RowKey
     */
    public static String genPassTemplateRowKey(PassTemplate passTemplate){

        String passInfo =String.valueOf(passTemplate.getId())+"_"+ passTemplate.getTitle();
        String rowKey = DigestUtils.md5Hex(passInfo);

        log.info("GenPassTemplateRowKey: {}, {}",passInfo,rowKey);
        return rowKey;
    }

    /**
     * 根据 Feedback 构造 RowKey
     * @param feedback {@link Feedback}
     * @return String RowKey
     */
    public static String genFeedBackRowKey(Feedback feedback){
        return new StringBuilder(String.valueOf(feedback.getUserId())).reverse().toString()+
                (Long.MAX_VALUE - System.currentTimeMillis());
    }

}
