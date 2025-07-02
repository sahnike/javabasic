package MT55_batch;
class Launch_Quit{
	static void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	void CloseBrowser() {
		System.out.println("Browser Closed");
	}
}
public class LoginAmazon extends Launch_Quit {
void OpenAmazon() {
	System.out.println("Accessed the Amazon site");
}
static void TestData() {
	System.out.println("test data provided");
}
	public static void main(String[] args) {
		//new LoginAmazon().OpenAmazon();
		//TestData();
		//Launch_Quit obj=new Launch_Quit();
		//obj.CloseBrowser();
		//Launch_Quit.LaunchBrowser();
		LoginAmazon ref=new LoginAmazon();
		//LoginAmazon.LaunchBrowser();
		LaunchBrowser();
		ref.OpenAmazon();
		TestData();
		ref.CloseBrowser();
		
	}

}
