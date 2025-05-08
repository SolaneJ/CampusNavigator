package com.github.solanej.service;

import com.github.solanej.vo.IdAndPassword;
import com.github.solanej.vo.ResponseBody;
import com.github.solanej.vo.UserInfo;
import com.github.solanej.vo.UserNameAndPassword;

/**
 * UserService
 *
 * @since 2025/5/8 16:36
 */
public interface UserService {

    /**
     * 注册
     */
    ResponseBody register(UserNameAndPassword userNameAndPassword);

    /**
     * 通过id删除用户
     */
    ResponseBody deleteUser(IdAndPassword idAndPassword);

    /**
     * 修改用户
     */
    ResponseBody updateUser(UserInfo userInfo);

    /**
     * 登录
     */
    ResponseBody login(String username, String password);
}
