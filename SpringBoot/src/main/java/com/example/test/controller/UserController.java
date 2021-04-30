package com.example.test.controller;


import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author libo
 * @since 2021-04-27
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("getlist")
   public List<User> getUserList(){
      return userService.getList();
   }
   @PostMapping("add")
    public void addUserDate(@RequestBody User user){
        userService.save(user);
   }

}

