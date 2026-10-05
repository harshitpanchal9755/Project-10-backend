package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CarDto;
import com.rays.form.CarForm;
import com.rays.service.CarServiceInt;

@RestController
@RequestMapping(value = "Car")
public class CarCtl extends BaseCtl<CarForm, CarDto, CarServiceInt> {

}
