package com.github.solanej.controller;

import com.github.solanej.service.UserService;
import com.github.solanej.vo.IdAndPassword;
import com.github.solanej.vo.ResponseBody;
import com.github.solanej.vo.UserInfo;
import com.github.solanej.vo.UserNameAndPassword;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * UserController
 *
 * @since 2025/5/8 16:30
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseBody userRegister(@RequestBody UserNameAndPassword userNameAndPassword) {
        return userService.register(userNameAndPassword);
    }

    @DeleteMapping("/delete")
    public ResponseBody deleteUser(@RequestBody IdAndPassword idAndPassword) {
        return userService.deleteUser(idAndPassword);
    }

    @PutMapping("/update")
    public ResponseBody updateUser(@RequestBody UserInfo userInfo) {
        return userService.updateUser(userInfo);
    }

    @GetMapping("/login")
    public ResponseBody userLogin(@RequestParam("username") String username,
                                  @RequestParam("password") String password) {
        return userService.login(username, password);
    }
}
