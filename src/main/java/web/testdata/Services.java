package web.testdata;

import java.util.List;

import jsonHelper.json;
import jsonHelper.json;

public interface Services {

	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Services";

	String enteServiceCenterCode = json.getTestDataString(FOLDER_NAME, FILE_NAME, "EnteServiceCenterCode");
	String serviceImport = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ImportServics");
}
