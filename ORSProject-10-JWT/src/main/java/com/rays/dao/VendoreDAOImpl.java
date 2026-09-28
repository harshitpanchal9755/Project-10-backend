package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VendoreDTO;

@Repository
public class VendoreDAOImpl extends BaseDAOImpl<VendoreDTO> implements VendoreDAOInt {

	@Override
	public Class<VendoreDTO> getDTOClass() {
		return VendoreDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VendoreDTO dto, CriteriaBuilder builder, Root<VendoreDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		
		if(isEmptyString(dto.getVendoreName())) {
			wherecondition.add(builder.like(qRoot.get("vendoreName"), dto.getVendoreName() + "%"));
		}
		return wherecondition;
	}

}
