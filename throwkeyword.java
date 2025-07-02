package MT55_batch;

public class throwkeyword {

	public static void main(String[] args) throws NullPointerException
	{
		if(1==2)
		{
		throw new NullPointerException("String is empty");
		}
		else 
		throw new StringIndexOutOfBoundsException("data not available");
		
		
		
	}

}
