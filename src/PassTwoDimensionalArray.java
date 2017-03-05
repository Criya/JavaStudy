import java.util.Scanner;

public class PassTwoDimensionalArray{
	public static void main(String args[]){
		int[][]m =getArray();

		System.out.println("\nSum of all elments is " + sum(m));
	}

	public static int[][] getArray(){
		Scanner imput = new Scanner(System.in);
		int[][] m = new int[3][4];
		System.out.print("Enter " + m.length + " row and " + m[0].length + " columns ");

		for (int row = 0; row < m.length; row++){
			for (int columns = 0; columns < m[row].length; columns++){
				m[row][columns] = imput.nextInt();
			}
		}
		return m;
	}

	public static int sum(int[][] m){
		int total = 0;
		for (int row = 0; row < m.length; row++){
			for (int columns= 0; columns < m[row].length; columns++){
				total += m[row][columns];
			}
		}
		return total;

	}
}