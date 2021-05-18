public class Naoborot {
    public static void main(String[] args) {
         System.out.println("podschetTsifr(1695) = " + podschetTsifr(1695));
        System.out.println("reverse(12345) = " + reverse(-12345));
    }
    public static int podschetTsifr(int x){
        int chisloTsifr =1;
        while ((int)(x/Math.pow(10,chisloTsifr))>0){
            ++chisloTsifr;
            }
        return chisloTsifr;
    }
    public static int reverse(int x){
        int result=0;
        int ostatok;
        if (x<0) return -1;


                    
        if (x==0) return 0;
        while(x>0){
            ostatok=x%10;
            result=result*10+ostatok;
            x=x/10;
            }
        return result;

    }
}
