/*
根据IBM的Hans Luhn提出的算法，验证信用卡卡号的有效性
		通常称为Luhn或Mod 10 检测
 */

import java.util.Scanner;

public class Luhn{
	public static void main(String args[]){
		Scanner imput = new Scanner(System.in);

		System.out.println("Enter a creadit card number as long numebr:");
		long cardNumber = imput.nextLong();

		if (isValid(cardNumber))
			System.out.println(cardNumber + " is valid");
		else
			System.out.println(cardNumber + " is invalid");
	}

	public static boolean isValid(long number){
		int len = getSize(number);
		if (len >16 || len <13)	return 1 < 0;			//卡号长度为13——16位
		if (prefixMathced(number))	return 1 < 0;
		int evenSum = sumOfDoubleEvenPlace(number);
		int oddSum = sumOfOddPlace(number);
		return  ((evenSum + oddSum) % 10 == 0);
	}

	//返回偶数位上两倍的值的合（若两倍后为二位数，则调用getDigit返回一个个位数）
	public static int sumOfDoubleEvenPlace(long number){
		int len = getSize(number) + 1;
		String numberChar = "0" + number;
		int sum = 0;
		for (int i = 1; i  < len; i++){
			if (i % 2 == 0)
				sum = sum + (int)(numberChar.charAt(i) - '0');}
		return sum;
	}

	//返回奇位数上的和
	public static int sumOfOddPlace(long number){
		int len = getSize(number) + 1;
		String numberChar = "0" + number;
		int sum = 0;
		for (int i = 1;i < len; i++){
			if (i % 2 != 0)
				sum += getDigit(((int)(numberChar.charAt(i) - '0')) * 2);		
			}
		return sum;
		}
		
	//如果是个位数，则直接返回number，如果是两位数，则返回个位与十位数的和
	public static int getDigit(int number){
		if (number < 10)
			return number;
		else
			return (number / 10  + number % 10); 
	}
	/*
	验证卡号开头是否为合法,若合法返回False,不合法返回True
	     4  : Visa
	     5  : Master
	     37 : American Express
	     6  : Discover
	 */
	public static boolean prefixMathced(long number){
		String numberChar = "0" + number;
		int perfix = (int)(numberChar.charAt(1) - '0');
		switch (perfix){
			case 4 : 
			case 5 : 
			case 6 : return 1 < 0;
		}
		if (perfix == 3){
			if (numberChar.charAt(2) == '7')
				return 1  < 0;
		}
		return 1 > 0;
	}
		
	//计算输入卡号的长度
	public static int getSize(long d){
		return String.valueOf( d ).length();

	}
}