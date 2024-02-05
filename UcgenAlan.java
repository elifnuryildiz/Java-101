package java_101;
import java.util.Scanner;

public class UcgenAlan {
public static void main(String[]args) {
	Scanner a = new Scanner(System.in);
	System.out.println("Birinci kenari giriniz: ");
	int kenar_1 = a.nextInt();
	
	System.out.println("İkinci kenari giriniz: ");
	int kenar_2 = a.nextInt();
	
	double hipo = Math.sqrt((kenar_1*kenar_1) + (kenar_2*kenar_2));
	
	System.out.println("Hipotenüs: " + hipo);
}
}
