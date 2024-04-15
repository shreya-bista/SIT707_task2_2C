package sit707_week2;

import dto.AccountInfo;
import seleniumops.SeleniumOperations;
import sit707_week2.constants.Constants;

public class Main 
{
    public static void main( String[] args )
    {
    	
    	AccountInfo newAccount = new AccountInfo("Shreya", "Bista", "0212345672", "shreya6@mailinator.com", "Test@123");
    	
    	SeleniumOperations seleniumOps = new SeleniumOperations();
    	seleniumOps.officeworks_registration_page(newAccount);
    }
}
