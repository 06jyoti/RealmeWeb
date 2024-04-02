package web.testdata;

import java.util.List;

import jsonHelper.json;
import jsonHelper.json;

public interface Employee {

	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Employee";
	
	String employeeFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "EmployeFile");
	String VendorCode = json.getTestDataString(FOLDER_NAME, FILE_NAME, "vendorCODE");
	String Editemail = json.getTestDataString(FOLDER_NAME, FILE_NAME, "editEmail");
	String VendorFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Vendorfile");
	String ReportingFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ReportingFile");
	
}
