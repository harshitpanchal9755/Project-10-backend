package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LightDAOInt;
import com.rays.dto.LightDTO;

@Service
@Transactional
public class LightServiceImpl extends BaseServiceImpl<LightDTO, LightDAOInt> implements LightServiceInt{

}
