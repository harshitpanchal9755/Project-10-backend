package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ProductDTO;

@Repository
public class ProductDAOImpl extends BaseDAOImpl<ProductDTO> implements ProductDAOInt{

	@Override
	public Class<ProductDTO> getDTOClass() {
		return ProductDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ProductDTO dto, CriteriaBuilder builder, Root<ProductDTO> qRoot) {
		
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(isEmptyString(dto.getProductName())) {
			wherecondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%"));
		}
		return wherecondition;
	}

}
