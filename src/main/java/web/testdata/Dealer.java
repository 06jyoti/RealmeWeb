package web.testdata;

import java.util.List;

import jsonHelper.json;
import jsonHelper.json;

public interface Dealer {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Dealer";

	String ADFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "adFile");
	String MobileNumber = json.getTestDataString(FOLDER_NAME, FILE_NAME, "mobileNumber");

}
