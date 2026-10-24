package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LaptopDaoInt;
import com.rays.dto.LaptopDto;

@Service
@Transactional
public class LaptopServiceImpl extends BaseServiceImpl<LaptopDto, LaptopDaoInt> implements LaptopServiceInt
{

}
