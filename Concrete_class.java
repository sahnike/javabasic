package MT55_batch;

public class Concrete_class {

	void concrete_mentod1(){
		System.out.println("Non-static concrete method is called");
	}
	
	static void concrete_mentod2(){
		System.out.println("static concrete method is called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Concrete_class().concrete_mentod1();
concrete_mentod2();
	}
	

}
