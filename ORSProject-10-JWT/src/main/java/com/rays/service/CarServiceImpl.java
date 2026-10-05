package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CarDaoInt;
import com.rays.dto.CarDto;

@Service
@Transactional
public class CarServiceImpl extends BaseServiceImpl<CarDto, CarDaoInt> implements CarServiceInt{

}
