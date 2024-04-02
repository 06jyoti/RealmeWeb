package web.testdata;

import java.util.List;

import jsonHelper.json;

public interface ProductMaster {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Visualization";
	
	String pointEstimate = json.getTestDataString(FOLDER_NAME, FILE_NAME, "PointEstimate");
	String forestPlot = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ForestPlot");
	String tableView = json.getTestDataString(FOLDER_NAME, FILE_NAME, "TableView");
	String singleChart = json.getTestDataString(FOLDER_NAME, FILE_NAME, "SingleChart");
	String comparingMultiple = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ComparingMultiple");
	String comparingMultipleInSingleChart = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ComparingMultipleInSingleChart");
	String comparingSingleEndpointInMultiple = json.getTestDataString(FOLDER_NAME, FILE_NAME, "ComparingSingleEndpointInMultiple");
	String subgroups = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Subgroups");
	String scenarios = json.getTestDataString(FOLDER_NAME, FILE_NAME, "Scenarios");
	


}
