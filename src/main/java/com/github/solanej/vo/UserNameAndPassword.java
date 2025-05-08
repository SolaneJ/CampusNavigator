package com.github.solanej.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserNameAndPasswordVo
 *
 * @since 2025/5/8 18:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserNameAndPassword {

    private String username;
    private String password;
}
