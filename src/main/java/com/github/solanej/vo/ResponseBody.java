package com.github.solanej.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 全局响应体
 *
 * @since 2025/5/8 16:31
 */
@Data
public class ResponseBody {

    private int code;

    private String msg;

    private Object data;

    private ResponseBody() {
    }

    private ResponseBody(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseBody success() {
        return new ResponseBody(200, "success", null);
    }

    public static ResponseBody success(Object data) {
        return new ResponseBody(200, "success", data);
    }

    public static ResponseBody error(String msg) {
        return new ResponseBody(500, msg, null);
    }
}
