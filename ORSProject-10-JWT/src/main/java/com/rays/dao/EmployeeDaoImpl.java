package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EmployeeDto;

@Repository
public class EmployeeDaoImpl extends BaseDAOImpl<EmployeeDto> implements EmployeeDaoInt{

	@Override
	public Class<EmployeeDto> getDTOClass() {
		return EmployeeDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(EmployeeDto dto, CriteriaBuilder builder, Root<EmployeeDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getEmployeeName())) {
			wherecondition.add(builder.like(qRoot.get("employeeName"), dto.getEmployeeName() + "%"));
		}
		return wherecondition;
	}

}
