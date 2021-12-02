package com.example.fatezero.service.impl;

import com.example.fatezero.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public boolean login(String name, String password) {
        return true;
    }
}