/*Program to Demostrate Access Specifier for method within a class
*/
package MT55_batch;

public class AccessSpecifier1 {
public static void add() {
	System.out.println("add method called");
}
private static void sub() {
	System.out.println("Subtract method called");
}
static void multi() {
	System.out.println("multiplication method called");
}
protected static void div() {
	System.out.println("Division method called");
}
public static void main(String[] args) {
	add();
	sub();
	multi();
	div();
}
}
