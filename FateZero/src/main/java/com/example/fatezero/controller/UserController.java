package com.example.fatezero.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.fatezero.service.IUserService;
import javax.annotation.Resource;

/**
 * @author brj
 */
@RestController
@RequestMapping("/user")
@Api("人员控制层")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/login")
    @ApiOperation(value = "登录")
    public ResponseEntity login(@RequestParam String name, @RequestParam String password) {
        return new ResponseEntity(userService.login(name, password), HttpStatus.OK);
    }

}
