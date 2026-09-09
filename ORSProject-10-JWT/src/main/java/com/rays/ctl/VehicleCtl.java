package com.rays.ctl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.VehicleDTO;
import com.rays.form.VehicleForm;

import com.rays.service.VehicleServiceInt;

@RestController
@RequestMapping(value = "Vehicle")
public class VehicleCtl extends BaseCtl<VehicleForm, VehicleDTO, VehicleServiceInt>{
	
	@Autowired
	VehicleServiceInt service;
	
	@PostMapping("post")
	public ORSResponse save(@RequestBody @Valid VehicleForm form, BindingResult bindingResult) {
		
		ORSResponse res = validate(bindingResult);
		if(!res.isSuccess()) {
			return res;
			
		}
		
		VehicleDTO dto = (VehicleDTO) form.getDto();
		
		service.add(dto, userContext);
		
		res.addData(dto);
		res.setSuccess(true);
		res.addMessage("Vehicle is SuccessFully");
		
		return res;
		
	}
	
	
	

}
