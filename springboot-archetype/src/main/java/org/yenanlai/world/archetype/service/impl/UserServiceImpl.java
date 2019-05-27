package org.yenanlai.world.archetype.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.yenanlai.world.archetype.domain.mapper.UserMapper;
import org.yenanlai.world.archetype.domain.model.User;
import org.yenanlai.world.archetype.service.UserService;

import com.github.pagehelper.PageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> get(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAll();
    }
}
