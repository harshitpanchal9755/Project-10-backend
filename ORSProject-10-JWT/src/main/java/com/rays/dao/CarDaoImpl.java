package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CarDto;

@Repository
public class CarDaoImpl extends BaseDAOImpl<CarDto> implements CarDaoInt{

	@Override
	public Class getDTOClass() {
		return CarDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(CarDto dto, CriteriaBuilder builder, Root<CarDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getCarName())) {
			wherecondition.add(builder.like(qRoot.get("carname"), dto.getCarName() + "%"));
		}
		return wherecondition;
	}

}
