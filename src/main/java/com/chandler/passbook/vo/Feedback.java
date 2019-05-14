package com.chandler.passbook.vo;

import com.chandler.passbook.constant.FeedbackType;
import com.google.common.base.Enums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date: 19-5-9
 * @version： V1.0
 * @Author: Chandler
 * @Description: 用户评论
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    /** 用户 id */
    private Long userId;

    /** 评论类型 */
    private String type;

    /** PassTemplate RowKey,如果是 app 类型,则没有 */
    private String templateId;

    /** 评论内容 */
    private String comment;

    public boolean validate(){
        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class,this.type.toUpperCase()
        ).orNull();
        return !(null == feedbackType || null == comment);
    }


}
