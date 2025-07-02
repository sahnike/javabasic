package MT55_batch;

public class ClassVariable {
	
	int instanceVar=10;
	int instanceVar1=50;
	static final int Svar=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int LocalVar=40;
		ClassVariable obj= new ClassVariable();
		ClassVariable obj1= new ClassVariable();
		System.out.println(obj.instanceVar);
		System.out.println(obj1.instanceVar1);
		System.out.println(ClassVariable.Svar);
		obj1.instanceVar=1000;
		System.out.println(obj1.instanceVar);
		System.out.println(obj.instanceVar);
		//ClassVariable.Svar=200;
		System.out.println(ClassVariable.Svar);
		System.out.println(LocalVar);
	}

}
