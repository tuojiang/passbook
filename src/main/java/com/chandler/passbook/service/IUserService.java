package com.chandler.passbook.service;

import com.chandler.passbook.vo.Response;
import com.chandler.passbook.vo.User;

/**
 * @Date: 19-5-13
 * @version： V1.0
 * @Author: Chandler
 * @Description: 用户服务: 创建 User 服务
 */
public interface IUserService {

    /**
     * 创建用户
     * @param user {@link User}
     * @return {@link Response}
     * @throws Exception
     */
    Response createUser(User user) throws Exception;
}
