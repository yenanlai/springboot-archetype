package org.yenanlai.world.archetype.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yenanlai.world.archetype.domain.entity.User;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * Mapper示例
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
