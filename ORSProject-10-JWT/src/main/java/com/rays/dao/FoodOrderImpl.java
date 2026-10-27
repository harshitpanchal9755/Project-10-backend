package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FoodOrderDto;

@Repository
public class FoodOrderImpl extends BaseDAOImpl<FoodOrderDto> implements FoodOrderDaoInt{

	@Override
	public Class<FoodOrderDto> getDTOClass() {
		return FoodOrderDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(FoodOrderDto dto, CriteriaBuilder builder, Root<FoodOrderDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getCustomerName())) {
			wherecondition.add(builder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}
		return  wherecondition;
	}

}
