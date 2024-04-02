
package web.testdata;

import jsonHelper.json;

public interface AreaDistributer {
	

	String FOLDER_NAME = "testdata";
	String FILE_NAME = "AreaDistributer";
	
	
	String areaCode = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ADCode");
	String areaName = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ADName");
	String areaContactPerson = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ContactPersonName");
	String areaEmail = json.getTestDataString(FOLDER_NAME, FILE_NAME, "email");
	String areaPhoneNo = json.getTestDataString(FOLDER_NAME, FILE_NAME, "PhoneNumber");
	String filterADByMobileNo = json.getTestDataString(FOLDER_NAME, FILE_NAME, "FilterMobileNumber");
	String updateADContactPersonName = json.getTestDataString(FOLDER_NAME, FILE_NAME, "UpdateADContactPersonName");
	String importADFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "FilePathAD");
}
