package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SmartParkingDTO;

@Repository
public class SmartParkingDAOImpl extends BaseDAOImpl<SmartParkingDTO> implements  SmartParkingDAOInt{

	@Override
	public Class<SmartParkingDTO> getDTOClass() {
		return SmartParkingDTO.class;
		
	}
	
	@Override
	protected List<Predicate> getWhereClause(SmartParkingDTO dto, CriteriaBuilder builder,
			Root<SmartParkingDTO> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(isEmptyString(dto.getVehicleName())) {
			
			wherecondition.add(builder.like(qRoot.get("vehicleNumber"), dto.getVehicleNumber() + "%"));
			
		}
		return wherecondition;

	}

}
