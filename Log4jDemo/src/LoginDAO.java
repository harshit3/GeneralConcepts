import org.apache.log4j.Logger;

public class LoginDAO{
	
	public String checkLogin(String userID,String password){
		Logger logger=Logger.getLogger(LoginDAO.class);
		//System.out.println("chekLogin method executing...");	//Foot-printing
		logger.debug("checkLogin method running...");
		if(userID.equals(password)){
			return("Welcome "+userID);
		}
		return "Sorry Wrong userID or Password";
	}
	public static void main(String[] args) {
		

	}

}
