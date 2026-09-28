package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SalaryDTO;

@Repository
public class SalaryDAOImpl extends BaseDAOImpl<SalaryDTO> implements SalaryDAOInt {

	@Override
	public Class<SalaryDTO> getDTOClass() {
		return SalaryDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SalaryDTO dto, CriteriaBuilder builder, Root<SalaryDTO> qRoot) {

		List<Predicate> wherecondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getEmployeeName())) {
			wherecondition.add(builder.like(qRoot.get("employeeName"), dto.getEmployeeName() + "%"));
		}

		return wherecondition;

	}

}
