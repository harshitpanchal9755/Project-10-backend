package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VendoreDAOInt;
import com.rays.dto.VendoreDTO;

@Service
@Transactional
public class VendoreServiceImpl extends BaseServiceImpl<VendoreDTO, VendoreDAOInt> implements VendoreServiceInt{

}
