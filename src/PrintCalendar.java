import java.util.Scanner;

public class PrintCalendar{
	public static void main(String args[]){
		Scanner imput = new Scanner(System.in);

		System.out.print("Enter full year (e.g. 2012) : ");
		int year = imput.nextInt();

		System.out.print("Enter mouth as a number between 1 and 12 : ");
		int month = imput.nextInt();

		printMonthTitle(year, month);
		printMonthBody(year, month);
	}
	//打印标题
	public static void printMonthTitle(int year, int month){
		System.out.printf("\t%s %d\n",getMonthNmae(month), year);
		System.out.println("- - - - - - - - - - - - - - - - ");
		System.out.println("  Sun Mon Tue Wed Thu Fri Sat");
	}

	//打印主体
	public static void printMonthBody(int year ,int month){
		int startDay = getStartDay(year, month);
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i < numberOfDaysInMonth; i++){
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	//返回月份的名字
	public static String getMonthNmae(int month){
		String monthName = "";
		switch ( month ) {
			case 1  : monthName = "January"; break;
			case 2  : monthName = "February"; break;
			case 3  : monthName = "March"; break;
			case 4  : monthName = "April"; break;
			case 5  : monthName = "May"; break;
			case 6  : monthName = "June"; break;
			case 7  : monthName = "July"; break;
			case 8  : monthName = "August"; break;
			case 9  : monthName = "September"; break;
			case 10 : monthName = "October"; break;
			case 11 : monthName = "November"; break;
			case 12 : monthName = "December"; break;
		}
		return monthName;
	}

	//判断月份第一天是星期几
	public static int getStartDay(int year, int month){
		//1800年一月一日是星期三
		final int START_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberDays = getTotalOfDays(year, month);
		return (START_DAY_FOR_JAN_1_1800 + totalNumberDays) % 7;
	}

	//从1800年到输入时间的天数
	public static int getTotalOfDays(int year, int month){
		int total = 0;
		for (int i = 1800; i < year; i++){
			if (isLeapYear(year))	
				total += 366;
			else 
				total += 365;
		}
		for (int i = 1; i < month; i++)
			total += getNumberOfDaysInMonth(year, i);

		return total;
	}
	
	//判断每个月的天数
	public static int getNumberOfDaysInMonth(int year, int month){
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
			return 31;
		if (month == 4 || month == 6 || month ==9 || month ==11)
			return 30;
		if (month ==2) 
			return isLeapYear(year) ? 29 : 28 ;

		return 0;
	}

	//判断是否是闰年
	public static boolean isLeapYear(int year){
		return year % 400 ==0 || (year % 4 == 0 && year % 100 != 0);
	}
}
