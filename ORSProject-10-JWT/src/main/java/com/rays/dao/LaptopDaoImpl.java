package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LaptopDto;

@Repository
public class LaptopDaoImpl extends BaseDAOImpl<LaptopDto> implements LaptopDaoInt{

	@Override
	public Class<LaptopDto> getDTOClass() {
		return LaptopDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LaptopDto dto, CriteriaBuilder builder, Root<LaptopDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getBranchName())) {
			wherecondition.add(builder.like(qRoot.get("branchName"), dto.getBranchName() + "%"));
		}
		return wherecondition;
	}

}
