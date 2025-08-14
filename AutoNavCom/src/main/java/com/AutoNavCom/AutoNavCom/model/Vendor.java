package com.AutoNavCom.AutoNavCom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Vendor {
	
	private Long vendorId;
    private String vendorName;
    private String mobileNo;
    private String emailId;
	

}
