package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LightDTO;
import com.rays.form.LightForm;
import com.rays.service.LightServiceInt;

@RestController
@RequestMapping(value = "Light") 
public class LigntCtl extends BaseCtl<LightForm, LightDTO, LightServiceInt>{
	
	

}
