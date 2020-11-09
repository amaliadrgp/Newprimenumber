package ro.fastrackit.classroom;
import java.util.*;
public class PrimeNumber {

    public static void main(String[] args) {

        int i = 0;
        int num = 0;
           String primeNumbers="";
           boolean isPrime = true;

           for (i = 2; i<100; i++){
               isPrime = true;
               for(int j = 2;j<=i/2; j++){
                   if (i%j==0){
                       isPrime=false;
                   }
               }
               if (isPrime)
                   System.out.print(" "+i);

           }

    }

}