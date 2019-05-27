package org.yenanlai.world.archetype.core;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BasicMapper<T> extends
                            ConditionMapper<T>,
                            IdsMapper<T>,
                            Mapper<T>,
                            MySqlMapper<T> {
}
