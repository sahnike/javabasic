package MT55_batch;

class NonStaticMethod_OutsideClass{
	void NonStatMeth()
	{
		System.out.println("Non-Static on another class");
	}
}
public class NonStatic_method_SameClass {
	// Non static method125 in same class
	void login() {
		System.out.println("Logged In");
	}
	void log_out() {
		System.out.println("Logged Out");
	}

	
	public static void main(String[] args) {
		NonStatic_method_SameClass obj = new NonStatic_method_SameClass();
		obj.login();
		obj.log_out();
			NonStaticMethod_OutsideClass obj2 = new NonStaticMethod_OutsideClass();
			obj2.NonStatMeth();
			
	}

}
