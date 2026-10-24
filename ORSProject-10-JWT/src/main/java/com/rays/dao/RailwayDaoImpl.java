package com.rays.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RailwayDto;

@Repository
public class RailwayDaoImpl extends BaseDAOImpl<RailwayDto> implements RailwayDaoInt{

	@Override
	public Class<RailwayDto> getDTOClass() {
		return RailwayDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(RailwayDto dto, CriteriaBuilder builder, Root<RailwayDto> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getPassengerName())) {
			whereCondition.add(builder.like(qRoot.get("passengerName"), dto.getPassengerName() + "%"));
		}
		return whereCondition;
	}
}

