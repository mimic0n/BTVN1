package xin_chao;
import java.util.Scanner;
class ch1bai3 {
	public static void main(String[]args) {
		Scanner k=new Scanner(System.in);
		double h, w;
		System.out.print("ïnput height :");
		h = k.nextDouble();
		System.out.print("ïnput width :");
		w = k.nextDouble();
		System.out.println("rectangle's perimeter :" +2*h+w*2);
		System.out.println("rectangle's area :"+ h*w);
	}

}
