package com.github.solanej.service;

import com.github.solanej.entity.User;
import com.github.solanej.mapper.UserMapper;
import com.github.solanej.vo.IdAndPassword;
import com.github.solanej.vo.ResponseBody;
import com.github.solanej.vo.UserInfo;
import com.github.solanej.vo.UserNameAndPassword;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @since 2025/5/8 16:38
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public ResponseBody login(String username, String password) {

        final User user = userMapper.login(
                User.builder()
                        .username(username)
                        .password(password)
                        .build()
        );

        if (user != null) {
            return ResponseBody.success(user);
        }

        return ResponseBody.error("用户名或密码错误");
    }

    @Override
    public ResponseBody register(UserNameAndPassword userNameAndPassword) {

        if (userMapper.register(
                UserNameAndPassword.builder()
                        .username(userNameAndPassword.getUsername())
                        .password(userNameAndPassword.getPassword()).build())) {
            return ResponseBody.success();
        }
        return ResponseBody.error("注册失败");
    }

    @Override
    public ResponseBody deleteUser(IdAndPassword idAndPassword) {
        switch (userMapper.deleteUser(idAndPassword)) {
            case 0 -> {
                return ResponseBody.error("删除失败");
            }
            case 1 -> {
                return ResponseBody.success();
            }
            default -> {
                return ResponseBody.error("系统异常");
            }
        }
    }

    @Override
    public ResponseBody updateUser(UserInfo userInfo) {
        if (userMapper.updateUserInfo(userInfo)) {
            return ResponseBody.success();
        }
        else {
            return ResponseBody.error("更新失败");
        }
    }
}
