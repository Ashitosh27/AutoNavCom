package com.AutoNavCom.AutoNavCom.service;

import org.springframework.stereotype.Service;

import com.AutoNavCom.AutoNavCom.model.Vendor;
import com.AutoNavCom.AutoNavCom.repository.VendorDao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService{
	
	private final VendorDao vendorDao;
	
	@Override
	public Boolean addVendorDetails(Vendor vendor) {	
		return vendorDao.addVendorDetails(vendor);
	}
	

}
