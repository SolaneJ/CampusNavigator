package com.github.solanej.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * IdAndPassword
 *
 * @since 2025/5/8 18:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdAndPassword {

    private String uid;

    private String password;
}
