package com.AutoNavCom.AutoNavCom.queries;

public class VendorQueries {
	
	public static String addVendor = "insert into Vendor_dtl (Vendor_Id,Vendor_Name,Vendor_MobileNo,vendor_emailId)\r\n"
			+ "values (:vendorId,:vendorName,:vendorMobileNo,:vendorEmail)";

}
