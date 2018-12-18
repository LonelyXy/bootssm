package com.xy.bootssm.controller;

import com.xy.bootssm.pojo.SysUser;
import com.xy.bootssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xyLonely
 * @date 2018/12/18 9:37
 */
@RestController
@RequestMapping("/sys/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login/{username}/{password}")
    public void login(@PathVariable("username") String username,@PathVariable("password") String password){
        System.out.println(username);
        System.out.println(password);
        SysUser sysUser = userService.login(username);
        System.out.println(sysUser);
    }

}
