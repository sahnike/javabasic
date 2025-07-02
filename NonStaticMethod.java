package MT55_batch;
  class C1{
	void signup() {
		System.out.println("SignUp from C1");
	}
}

public class NonStaticMethod {
  void login() {
	System.out.println("login method called");
}
 void logout() {
	System.out.println("logout method called");
}
	public static void main(String[] args) {
		
 NonStaticMethod ref=	new NonStaticMethod();
		//System.out.println(ref); why o/p is MT55_batch.NonStaticMethod@65b3120a
 ref.login();
 ref.logout();
 C1 ref1 = new C1();
ref1.signup();
 //new C1().signup();
 
	}

}
