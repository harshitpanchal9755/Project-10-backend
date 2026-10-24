package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.RailwayDto;
import com.rays.form.RailwayForm;
import com.rays.service.RailwayServiceInt;

@RestController
@RequestMapping(value = "Railway")
public class RailwayCtl extends BaseCtl<RailwayForm, RailwayDto, RailwayServiceInt>{

}
