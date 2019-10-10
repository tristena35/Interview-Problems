
public class DefangedIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(changeIP("1.1.1.1"));
		
	}
	
	public static String changeIP(String address) {
		
		String n = "[.]";
		String newAddress = "";
		
		for(int i = 0; i < address.length(); i ++) {
			//if its a period
			if(address.charAt(i) == '.')
				newAddress += n; //replace it
			else
				newAddress += address.charAt(i); //add it to string
		}
		return newAddress;
	}

}
