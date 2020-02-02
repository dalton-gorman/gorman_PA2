import java.util.Scanner;

public class Application {

	static Scanner input = new Scanner(System.in);
	
	//
	
	public static void main(String[] args) {
		int password = getpassword();
		//run encryption and print the number
		System.out.println(String.format("Encrypted password: %04d", Encrypter.encrypt(password)));
		System.out.println(String.format("Decrypted password: %04d", Decrypter.decrypt(password)));
		
	}
	
	//User should input 4 digit number
	
	public static int getpassword() {
		int password;
			System.out.println("Please enter a four digit number: ");
			password = input.nextInt();
		return password;
	}
	
		
}


