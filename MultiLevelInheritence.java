package MT55_batch;
class Grand_parent{
	public void Method_in_grandparent()
	{
		System.out.println("Calling the Method in GrandParent");
	}
}
class Parent extends Grand_parent{
	public void Method_in_Parent()
	{
		System.out.println("Calling the Method in Parent");
	}
}

public class MultiLevelInheritence extends Parent {
	public void Method_Child() {
	System.out.println("calling the method in Child");
	}

	public static void main(String[] args) {
 MultiLevelInheritence ref = new MultiLevelInheritence();
 ref.Method_Child();
 ref.Method_in_Parent();
 ref.Method_in_grandparent();
 System.out.println();
	}

}
