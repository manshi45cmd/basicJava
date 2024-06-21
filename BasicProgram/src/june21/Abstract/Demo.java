package june21.Abstract;

public class Demo {
	public static void main(String[] args) {
		//DemoAbstract a = new DemoAbstract();// you can`t insiaict
		ChildOfAbstract abs = new ChildOfAbstract();
		abs.bankLogo();
		abs.saveCutomerDetails();
		abs.takeLoan();
	}

}
