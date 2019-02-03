package LiczbaPierwsza;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner kayboard = new Scanner(System.in);
        IsPrime liczba = new IsPrime();

        System.out.println("Podaj Wartość");
        int a = kayboard.nextInt();
        System.out.println("value " + a + " is Prime " + liczba.isPrime(a));
    }
}
