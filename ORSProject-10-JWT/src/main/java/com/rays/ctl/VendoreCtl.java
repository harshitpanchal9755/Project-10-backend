package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.VendoreDTO;
import com.rays.form.VendoreForm;
import com.rays.service.VendoreServiceInt;

@RestController
@RequestMapping(value = "Vendore")
public class VendoreCtl extends BaseCtl<VendoreForm, VendoreDTO, VendoreServiceInt>{

}
