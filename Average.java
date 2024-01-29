package java_101;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	
	int toplamNot = 0;
	int dersSayisi = 6;
		
	for(int i=1;i<=dersSayisi;i++) {
	   System.out.print(i + ".notunuzu giriniz: ");
	   int not = input.nextInt();
	   toplamNot+= not;
	
	
	}
	
	double ortalama = (double)toplamNot/dersSayisi;
	
	System.out.print("Not ortalamasi: "+ ortalama);
	
	}
}
