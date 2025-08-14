package com.AutoNavCom.AutoNavCom.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.AutoNavCom.AutoNavCom.model.Vendor;
import com.AutoNavCom.AutoNavCom.queries.VendorQueries;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
@RequiredArgsConstructor
public class VendorDaoImpl implements VendorDao {

	@Autowired
	private final NamedParameterJdbcTemplate npjt;

	@Override
	public Boolean addVendorDetails(Vendor vendor) {
		int result = 0;
		Map<String, Object> paramMap = new HashMap();
		paramMap.put("vendorId", vendor.getVendorId());
		paramMap.put("vendorName", vendor.getVendorName());
		paramMap.put("vendorMobileNo", vendor.getMobileNo());
		paramMap.put("vendorEmail", vendor.getEmailId());

		result = npjt.update(VendorQueries.addVendor, paramMap);
		if (result == 1) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}
