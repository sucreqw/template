package com.easymiracle.service.impl;

import com.easymiracle.repository.entity.CitiesDO;
import com.easymiracle.repository.dao.CitiesMapper;
import com.easymiracle.service.ICitiesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-05-08
 */
@Service
public class CitiesServiceImpl extends ServiceImpl<CitiesMapper, CitiesDO> implements ICitiesService {

}
