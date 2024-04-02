package web.testdata;

import jsonHelper.json;

public interface ZonalDistributer {
	
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "ZonalDistributer";
	
	
	String zonalCode = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ZDCode");
	String zonalName = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ZDName");
	String zonalContactPerson = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ContactPersonName");
	String zonalEmail = json.getTestDataString(FOLDER_NAME, FILE_NAME, "email");
	String zonalPhoneNo = json.getTestDataString(FOLDER_NAME, FILE_NAME, "PhoneNumber");
	String filterZDCode = json.getTestDataString(FOLDER_NAME, FILE_NAME, "FilterZDCode");
	String filterZDMobileNo = json.getTestDataString(FOLDER_NAME, FILE_NAME, "FilterMobileNumber");
	String updateZDContactPersonName = json.getTestDataString(FOLDER_NAME, FILE_NAME, "UpdateZDContactPersonName");
	String importZDFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "FilePath");
	String GSTNo = json.getTestDataString(FOLDER_NAME, FILE_NAME, "GSTNumber");
	String PANCardNo = json.getTestDataString(FOLDER_NAME, FILE_NAME, "PANNumber");
	String GSTPDF = json.getTestDataString(FOLDER_NAME, FILE_NAME, "gstPDF");
	String PANPDF = json.getTestDataString(FOLDER_NAME, FILE_NAME, "panPDF");
	
	
          		 

}
