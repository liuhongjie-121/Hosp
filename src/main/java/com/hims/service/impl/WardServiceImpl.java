package com.hims.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hims.pojo.Ward;
import com.hims.service.WardService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

@Service
public class WardServiceImpl implements WardService {
    @Override
    public boolean saveBatch(Collection<Ward> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Ward> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Ward> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Ward entity) {
        return false;
    }

    @Override
    public Ward getOne(Wrapper<Ward> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Ward> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Ward> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<Ward> getBaseMapper() {
        return null;
    }
}
