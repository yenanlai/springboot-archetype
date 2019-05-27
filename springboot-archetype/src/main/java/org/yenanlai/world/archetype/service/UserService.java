package org.yenanlai.world.archetype.service;

import java.util.List;

import org.yenanlai.world.archetype.domain.model.User;

public interface UserService {

    List<User> get(int pageNum, int pageSize);
}
