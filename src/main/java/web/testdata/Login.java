package web.testdata;
import java.util.List;
import jsonHelper.json;

public interface Login {
	
	String FOLDER_NAME = "testdata";
	String FILE_NAME = "Login";
	
	String userID = json.getTestDataString(FOLDER_NAME, FILE_NAME, "UserCode");
	String USERID = json.getTestDataString(FOLDER_NAME, FILE_NAME, "userCode");
	String PASSWORD = json.getTestDataString(FOLDER_NAME, FILE_NAME, "userPass");
	String Password = json.getTestDataString(FOLDER_NAME, FILE_NAME, "UserPass");


}
