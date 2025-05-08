package com.github.solanej.mapper;

import com.github.solanej.entity.User;
import com.github.solanej.vo.IdAndPassword;
import com.github.solanej.vo.UserInfo;
import com.github.solanej.vo.UserNameAndPassword;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * UserMapper
 *
 * @since 2025/5/8 16:02
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM cn_user WHERE uid = #{id}")
    User selectById(int id);

    @Select("SELECT * FROM cn_user")
    List<User> selectAll();

    /**
     * 用户登录
     */
    @Select("SELECT * FROM cn_user WHERE username = #{username} AND password = md5(#{password})")
    User login(User user);

    /**
     * 用户注册
     */
    @Insert("INSERT INTO cn_user (username, password) VALUES (#{username},md5(#{password}))")
    boolean register(UserNameAndPassword userNameAndPassword);

    /**
     * 更新密码
     */
    @Update("UPDATE cn_user SET password = #{password} WHERE uid = #{uid}")
    boolean updatePasswordById(User user);

    /**
     * 更新用户信息
     */
    boolean updateUserInfo(UserInfo userInfo);

    /**
     * 删除账户
     */
    @Update("UPDATE cn_user SET is_delete = '1' WHERE uid = #{uid} AND password = md5(#{password})")
    int deleteUser(IdAndPassword idAndPassword);
}
