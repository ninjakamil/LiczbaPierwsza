package LiczbaPierwsza;

public class IsPrime {
    public static Boolean isPrime(int num){
        if(num==2){
            return(true);
        }
        for(int i=2;i<=(int)Math.sqrt(num)+1;i++){
            if(num%i==0){
                return(false);
            }
        }
        return(true);
    }
}
