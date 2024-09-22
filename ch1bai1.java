
package xin_chao;

import java.util.Scanner;

public class ch1bai1  {
public static void main(String[]args) {
	
	System.out.print("nhap mot so n bat ky :");
	Scanner k=new Scanner(System.in);
	double n;
	n = k.nextDouble();
	System.out.println("cos(n) =" + Math.cos(Math.toRadians(n)));
	System.out.println("sin(n) =" + Math.sin(Math.toRadians(n)));
	System.out.println("can bac 2 cua n =" + Math.sqrt(n));
}

}
