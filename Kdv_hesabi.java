package java_101;
import java.util.Scanner;

public class Kdv_hesabi {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Hesaplanacak tutari giriniz: ");
      double tutar = input.nextDouble();
	  
	  
      double kdv_tutari_1 = 0.18*tutar;
      double kdv_tutari_2 = 0.08*tutar;
      double kdvli_tutar_1=tutar+kdv_tutari_1;
      double kdvli_tutar_2=tutar+kdv_tutari_2;
    
      
    
      
      if (tutar > 0 && tutar <= 1000) {
    	  
    	 System.out.print("KDV'li hali hesaplanmıştır: "+ kdvli_tutar_1); 
    	 
      }else if (tutar >= 1000) {
    	  System.out.print("KDV'li hali hesaplanmıştır: "+ kdvli_tutar_2); 
      }
      
      
}
}