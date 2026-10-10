package com.rays.ctl;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.MovieDto;
import com.rays.form.MovieForm;
import com.rays.service.MovieServiceInt;

@RestController
@RequestMapping("Movie")
public class MovieCtl extends BaseCtl<MovieForm, MovieDto, MovieServiceInt>{

}
