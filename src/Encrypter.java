
public class Encrypter {

	public static int encrypt(int password) {
		//set temporary holder for password
		int number = password;
		//add 7 and divide by 10 to get remainder
		int dig4 = (number + 7) % 10;
		// divide by 10 each time to remove a digit from the number
		number = number / 10;
		int dig3 = (number + 7) % 10;
		number = number / 10;
		int dig2 = (number + 7) % 10;
		number = number / 10;
		int dig1 = (number + 7) % 10;
		//multiply digits by the position you want them. Add a zero for each multiplication (3,4,1,2)
		return (dig3 * 1000 + dig4 * 100 + dig1 * 10 + dig2);
		
	}

}
