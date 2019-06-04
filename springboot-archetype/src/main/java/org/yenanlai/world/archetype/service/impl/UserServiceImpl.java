package org.yenanlai.world.archetype.service.impl;

import org.springframework.stereotype.Service;
import org.yenanlai.world.archetype.domain.entity.User;
import org.yenanlai.world.archetype.domain.mapper.UserMapper;
import org.yenanlai.world.archetype.service.UserService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * ServiceImpl示例
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
