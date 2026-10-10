package com.rays.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;

@Repository
public class MovieDaoImpl extends BaseDAOImpl<MovieDto> implements MovieDaoInt{

	@Override
	public Class<MovieDto> getDTOClass() {
		return MovieDto.class;
	}

	@Override
	protected List<Predicate> getWhereClause(MovieDto dto, CriteriaBuilder builder, Root<MovieDto> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		wherecondition.add(builder.like(qRoot.get("movieName"), dto.getMovieName() + "%"));
		return wherecondition;
	}

}
