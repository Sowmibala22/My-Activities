package week1.day1;

public class Mobile {
	
	public void makecall() {
		String mobilemodel = "XIAOMI";
		float mobileweight = 173.8f;
		System.out.println("Mobile Model :" +mobilemodel+"\n"+"Mobile Weight :" +mobileweight);
		
	}

	public void sendmsg() {
		boolean isfullycharged = true;
		int mobilecost = 14000;
		System.out.println("Mobile is fully Charged :" +isfullycharged + "\n" + "Mobile cost is :" + mobilecost);
	}
	
	public static void main(String[] args) {
		Mobile MI = new Mobile();
		MI.makecall();
		MI.sendmsg();
		
		   System.out.println("This is my Mobile");
		// TODO Auto-generated method stub

	}

}
