class MyAccount implements IMyAccount{
	public void withdraw(){
		if(isAccountExist()){
			if(isTractionAvailable()){
				System.out.println("Withdraw Successfull.");
			}
		}
	}
	
	boolean isAccountExist(){
		return true;
	}
	
	boolean isTractionAvailable(){
		return true;
	}
}

interface IMyAccount{
	void withdraw();
}

public class UsingAbstraction{

	public static void main(String[] args) {

		IMyAccount account=new MyAccount();
		account.withdraw();
	}

}
