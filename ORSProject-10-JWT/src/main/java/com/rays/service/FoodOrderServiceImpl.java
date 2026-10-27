package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FoodOrderDaoInt;
import com.rays.dto.FoodOrderDto;

@Service
@Transactional
public class FoodOrderServiceImpl extends BaseServiceImpl<FoodOrderDto, FoodOrderDaoInt> implements FoodOrderServiceInt{

}
