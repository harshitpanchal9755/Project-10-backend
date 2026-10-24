package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OnlineExaminationDaoInt;
import com.rays.dto.OnlineExaminationDto;

@Service
@Transactional
public class OnlineExaminationServiceImpl extends BaseServiceImpl<OnlineExaminationDto, OnlineExaminationDaoInt> implements OnlineExmainationServiceInt{

}
