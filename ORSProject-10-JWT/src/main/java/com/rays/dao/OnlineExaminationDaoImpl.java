package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OnlineExaminationDto;

@Repository
public class OnlineExaminationDaoImpl extends BaseDAOImpl<OnlineExaminationDto> implements OnlineExaminationDaoInt{

	@Override
	public Class<OnlineExaminationDto> getDTOClass() {
		return OnlineExaminationDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(OnlineExaminationDto dto, CriteriaBuilder builder,
			Root<OnlineExaminationDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getSchoolName())) {
			wherecondition.add(builder.like(qRoot.get("schoolName"), dto.getSchoolName() + "%"));
			
		}
		return wherecondition;
	}

}
