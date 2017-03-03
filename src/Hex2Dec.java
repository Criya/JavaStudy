import java.util.Scanner;

public class Hex2Dec {
	public static void main(String args[]) {
		Scanner imput = new Scanner(System.in);

		System.out.print("Enter a hex number :");
		String hex = imput.nextLine();

		System.out.println("The decimal value for hex number "  + hex + " is " + hexToDecimal(hex.toUpperCase()));
	}

	public static int hexToDecimal(String ch) {
		int decimalValue = 0;

		for (int i = 0; i < ch.length(); i++) {
			char hexChar = ch.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F')
			return (10 + ch - 'A');
		else
			return (ch - '0');
	}

}
