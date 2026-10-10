package com.rays.service;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.EmployeeDaoInt;
import com.rays.dto.EmployeeDto;

@Service
@Transactional
public class EmployeeServiceImpl extends BaseServiceImpl<EmployeeDto, EmployeeDaoInt> implements EmployeeServiceInt{

}
