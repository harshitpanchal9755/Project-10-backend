package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VehicleDTO;

@Repository
public class VehicleDAOImpl extends BaseDAOImpl<VehicleDTO> implements VehicleDAOInt {

	@Override
	public Class<VehicleDTO> getDTOClass() {
		return VehicleDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VehicleDTO dto, CriteriaBuilder builder, Root<VehicleDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<>();

		if (!isEmptyString(dto.getVehicleName())) {
			wherecondition.add(builder.like(qRoot.get("vehicleName"), dto.getVehicleName() + ""));
		}
		return wherecondition;
	}

}
