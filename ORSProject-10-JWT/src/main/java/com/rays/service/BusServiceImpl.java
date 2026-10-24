package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BusDaoInt;
import com.rays.dto.BusDto;

@Service
@Transactional
public class BusServiceImpl extends BaseServiceImpl<BusDto, BusDaoInt> implements BusServiceInt{

}
