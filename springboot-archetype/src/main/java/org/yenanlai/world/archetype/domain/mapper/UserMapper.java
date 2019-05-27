package org.yenanlai.world.archetype.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yenanlai.world.archetype.core.BasicMapper;
import org.yenanlai.world.archetype.domain.model.User;

@Mapper
public interface UserMapper extends BasicMapper<User> {
}