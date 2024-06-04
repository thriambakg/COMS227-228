package postage1;

import java.util.Scanner;

public class PostageUtilTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		System.out.println(PostageUtil.computePostage(scan.nextDouble()));
	}

}
