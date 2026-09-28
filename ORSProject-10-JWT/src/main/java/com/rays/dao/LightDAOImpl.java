package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LightDTO;

@Repository
public class LightDAOImpl extends BaseDAOImpl<LightDTO> implements LightDAOInt{

	@Override
	public Class<LightDTO> getDTOClass() {
		return LightDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(LightDTO dto, CriteriaBuilder builder, Root<LightDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getRoomName())) {
			wherecondition.add(builder.like(qRoot.get("roomName"), dto.getRoomName() + "%"));
		
		}
		return wherecondition;
	}

}
