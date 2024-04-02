package web.testdata;

import jsonHelper.json;

public interface SchemeManagement {
	
	    String FOLDER_NAME = "testdata";
    	String FILE_NAME = "SchemeManagement";
	  
		String File = json.getTestDataString(FOLDER_NAME, FILE_NAME, "SchemeFile");

}