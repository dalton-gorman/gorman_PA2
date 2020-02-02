
public class Decrypter {

	public static int decrypt(int password) {
		//set temporary holder for password
		int number = password;
		//check if each digit is less than 7
			//if less than 7, add 3
			//if 7 or above, subtract 7
		//int dig1, dig2, dig3, dig4;
		int dig2 = (number % 10);
		number = number / 10;
		int dig1 = number % 10;
		number = number / 10;
		int dig4 = number % 10;
		number = number / 10;
		int dig3 = number % 10;
		if (dig1 < 7) {
			dig1 = dig1 + 3;
		} else {
			dig2 = dig2 - 7;
		}
		if (dig2 < 7) {
			dig2 = dig2 + 3;
		} else {
			dig2 = dig2 - 7;
		}
		if (dig3 < 7) {
			dig3 = dig3 + 3;
		} else {
			dig3 = dig3 - 7;
		}
		if (dig4 < 7) {
			dig4 = dig4 + 3;
		} else {
			dig4 = dig4 - 7;
		}
		
		//multiply digits by the position you want them. Add a zero for each multiplication (3,4,1,2)
		return (dig1 * 1000 + dig2 * 100 + dig3 * 10 + dig4);		

	}

}
