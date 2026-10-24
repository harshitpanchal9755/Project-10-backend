package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.BusDto;
import com.rays.form.BusForm;
import com.rays.service.BusServiceInt;

@RestController
@RequestMapping(value = "Bus")
public class BusCtl extends BaseCtl<BusForm, BusDto, BusServiceInt> {

}
