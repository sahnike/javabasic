package MT55_batch;

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) {
		
		int array1[] = new int[2];
		array1[0] = 0;
		array1[1]=1;
		//array1[2]=3;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		//System.out.println(array1[2]);
		int array2[] = new int[2];
		array2[0]= array1[0];
		array2[1]= array1[1];
		System.out.println(array2[0]);
		System.out.println(array2[1]);
	}

}
