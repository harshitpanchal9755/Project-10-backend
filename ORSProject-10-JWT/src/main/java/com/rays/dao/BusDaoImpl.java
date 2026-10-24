package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BusDto;

@Repository
public class BusDaoImpl extends BaseDAOImpl<BusDto> implements BusDaoInt{

	@Override
	public Class<BusDto> getDTOClass() {
		return BusDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BusDto dto, CriteriaBuilder builder, Root<BusDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getBusName())) {
			wherecondition.add(builder.like(qRoot.get("busName"), dto.getBusName() + "%"));
		}
		return wherecondition;
	}

}
