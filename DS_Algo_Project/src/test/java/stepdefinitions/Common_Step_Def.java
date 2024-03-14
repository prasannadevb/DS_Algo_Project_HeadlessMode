package stepdefinitions;

import app_hooks.App_Hooks;
import constants.Constants;
import page_model.LoginPageObjects;

public class Common_Step_Def {
	
	private static Common_Step_Def common_Step_Def;
	
	public static Common_Step_Def getInstance() {
		if(common_Step_Def==null) {
			common_Step_Def= new Common_Step_Def();
		}
		return common_Step_Def;

	}
	
	public void login() {
		App_Hooks.getInstance().getDriver().get(Constants.LOGINPAGE);
		LoginPageObjects.getInstance().enterUsername();
		LoginPageObjects.getInstance().enterPassword();
		LoginPageObjects.getInstance().clickLogin();
		
	}
	
	public void logout() {
		
		
		
	}
	
	
	
}
	