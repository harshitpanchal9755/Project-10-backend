package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LaptopDto;
import com.rays.form.LaptopForm;
import com.rays.service.LaptopServiceInt;

@RestController
@RequestMapping(value = "Laptop")
public class LaptopCtl extends BaseCtl<LaptopForm, LaptopDto, LaptopServiceInt>{

}
