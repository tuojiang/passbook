package com.chandler.passbook.service.impl;

import com.chandler.passbook.service.IUserService;
import com.chandler.passbook.vo.Response;
import com.chandler.passbook.vo.User;
import com.spring4all.spring.boot.starter.hbase.api.HbaseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Date: 19-5-13
 * @version： V1.0
 * @Author: Chandler
 * @Description: ${todo}
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    /** HBase 客户端 */
    private HbaseTemplate hbaseTemplate;

    /** redis 客户端 */
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    public UserServiceImpl(HbaseTemplate hbaseTemplate, StringRedisTemplate stringRedisTemplate) {
        this.hbaseTemplate = hbaseTemplate;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public Response createUser(User user) throws Exception {
        return null;
    }

    private static Long genUserId(Long prefix){
        String suffix = RandomStringUtils.randomNumeric(5);
        return Long.valueOf(prefix+suffix);
    }

    public static void main(String[] args) {
        String suffix = RandomStringUtils.randomNumeric(5);
        System.out.println(genUserId(7L));

    }
}
