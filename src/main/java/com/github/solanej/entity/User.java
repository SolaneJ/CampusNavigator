package com.github.solanej.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * User
 *
 * @since 2025/5/8 16:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private Integer uid;

    private String username;

    private String password;

    private String email;

    private Timestamp created_at;

    private Character is_delete;
}
