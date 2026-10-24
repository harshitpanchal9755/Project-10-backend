package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RailwayDaoInt;
import com.rays.dto.RailwayDto;

@Service
@Transactional
public class RailwayServiceImpl extends BaseServiceImpl<RailwayDto, RailwayDaoInt> implements RailwayServiceInt{

}
