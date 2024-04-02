package web.testdata;

import java.util.List;

import jsonHelper.json;

public interface StockMaster {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "StockMaster";
	
	String StockFile = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Stockfile");
	}


