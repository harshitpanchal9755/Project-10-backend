package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dto.MovieDaoInt;
import com.rays.dto.MovieDto;

@Service
@Transactional
public class MovieServiceImpl extends BaseServiceImpl<MovieDto, MovieDaoInt> implements MovieServiceInt{

}
