
package yildizlarladikücgenyapma;
import java.util.*;
public class YildizlarlaDikÜcgenYapma {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir sayı giriniz:");
       int sayi = input.nextInt();
       
       for(int i=0; i<=sayi ; i++)
       {
           for(int j=0; j<(sayi-1) ; j++)
           {
               System.out.print(" ");
           }
           for(int k=1; k<=(2*i+1); k++)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }
    
}