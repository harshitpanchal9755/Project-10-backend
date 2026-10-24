package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.OnlineExaminationDto;
import com.rays.form.OnlineExaminationForm;
import com.rays.service.OnlineExmainationServiceInt;

@RestController
@RequestMapping(value = "OnlineExamination")
public class OnlineExaminationCtl extends BaseCtl<OnlineExaminationForm, OnlineExaminationDto, OnlineExmainationServiceInt>{

}
