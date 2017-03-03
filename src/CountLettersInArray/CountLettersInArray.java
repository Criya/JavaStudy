//随机生成100个小写字母保存在一个数组中，然后统计它们出现的次数，显示

public class CountLettersInArray{
	public static void main(String args[]){
		char[] chars = creatArray();

		System.out.println("The lower case is:");
		displayArray(chars);

		int[] counts = countLetters(chars);

		System.out.println();
		System.out.println("The occurences of each letter are:");
		displayCounts(counts);
	}

	public static char[] creatArray(){			//创建100个随机小写字母

		char[] chars = new char[100];

		for (int i = 0; i < chars.length; i++)
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();		//自定义类

		return chars;
	}

	public static void displayArray(char[] chars){		//显示随机字母的数组
		for(int i = 0; i < chars.length; i++){
			if ((i + 1) % 20 == 0)
				System.out.println(chars[i]);
			else
				System.out.print(chars[i] + " ");
		}
	}

	public static int[] countLetters(char[] chars){				//计算数量
		int[] counts = new int[26];

		for(int i = 0; i < chars.length; i++)
			counts[chars[i] - 'a']++;

		return counts;
	}

	public static void displayCounts(int[] counts){				//显示统计数量后的数组
		for (int i = 0; i < counts.length; i++){
			if ((i + 1) % 10 == 0)
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			else
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
		}
	}


}