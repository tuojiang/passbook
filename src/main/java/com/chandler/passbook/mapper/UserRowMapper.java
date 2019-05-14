package com.chandler.passbook.mapper;

import com.chandler.passbook.constant.Constants;
import com.chandler.passbook.vo.User;
import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * @Date: 19-5-13
 * @version： V1.0
 * @Author: Chandler
 * @Description: ${todo}
 */
public class UserRowMapper implements RowMapper<User> {

    private static byte[] FAMILY_B = Constants.UserTble.FAMILY_B.getBytes();
    private static byte[] NAME = Constants.UserTble.NAME.getBytes();
    private static byte[] AGE = Constants.UserTble.AGE.getBytes();
    private static byte[] SEX = Constants.UserTble.SEX.getBytes();

    private static byte[] FAMILY_O = Constants.UserTble.FAMILY_B.getBytes();
    private static byte[] PHONE = Constants.UserTble.PHONE.getBytes();
    private static byte[] ADDRESS = Constants.UserTble.ADDRESS.getBytes();

    @Override
    public User mapRow(Result result, int i) throws Exception {

        User.BaseInfo baseInfo = new User.BaseInfo(
                Bytes.toString(result.getValue(FAMILY_B,NAME)),
                Bytes.toInt(result.getValue(FAMILY_B,AGE)),
                Bytes.toString(result.getValue(FAMILY_B,SEX))
        );

        User.OtherInfo otherInfo = new User.OtherInfo(
                Bytes.toString(result.getValue(FAMILY_O,PHONE)),
                Bytes.toString(result.getValue(FAMILY_O,ADDRESS))
        );


        return new User(Bytes.toLong(result.getRow()),baseInfo,otherInfo);
    }
}
