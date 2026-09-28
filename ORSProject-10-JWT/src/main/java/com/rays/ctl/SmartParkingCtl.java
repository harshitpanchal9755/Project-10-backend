package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SmartParkingDTO;
import com.rays.form.smartParkingForm;
import com.rays.service.SmartParkingServiceInt;

@RestController
@RequestMapping(value = "SmartParking")
public class SmartParkingCtl extends BaseCtl<smartParkingForm, SmartParkingDTO, SmartParkingServiceInt>{

}
