package com.github.solanej;

import com.github.solanej.entity.User;
import com.github.solanej.mapper.UserMapper;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

/**
 * CampusNavigatorApplicationTest
 *
 * @since 2025/5/8 14:02
 */
@Log
@SpringBootTest
public class CampusNavigatorApplicationTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试数据库链接状态
     */
    @Test
    void testDatabaseConnection() {
        try (var connection = dataSource.getConnection()) {
            log.info("Database connection successful: " + connection.getMetaData().getURL());
        } catch (Exception e) {
            log.info("Database connection failed: " + e.getMessage());
        }
    }

    /**
     * 获取所有用户信息
     */
    @Test
    void testSelectAllUser() {
        userMapper.selectAll().forEach(user -> {
            log.info(user.toString());
        });
    }
}
