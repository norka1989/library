import java.util.Arrays;

public class Zanjatie13 {
    public static void main(String[] args) {
        int [] massiv={5,7,1,-8,7,10,14,2};
        //находим минимум
        int min=massiv[0];
        int sum=massiv[0];
        for(int i=1;i<massiv.length;i++){
            if (massiv[i]<min){
                min=massiv[i];
            }
            sum+=massiv[i];
        }
        //find middle value
        double middleValue=(double)sum/massiv.length;
        System.out.println("min = "+min);
        System.out.println("middleValue - "+middleValue);
        System.out.println("---------------------");

        //находим 2 минимума
        int min1=massiv[0];
        int min2=massiv[0];
        for (int i=1;i<massiv.length;i++){
            if(massiv[i]<min1){
                min2=min1;
                min1=massiv[i];
            }
        }
        System.out.println("min1= "+min1+"\n"+
                "min2= "+min2);
        System.out.println("---------------------");

        //находим 3 минимума
        int min11=massiv[0];
        int min12=massiv[0];
        int min13=massiv[0];
        for(int i=1;i<massiv.length;i++){
            if(massiv[i]<min11){
                min13=min12;
                min12=min11;
                min11=massiv[i];
            }
        }
        System.out.println(min11);
        System.out.println(min12);
        System.out.println(min13);
    //методом сортировки
        System.out.println("---------------------");
        Arrays.sort(massiv);
        System.out.println(Arrays.toString(massiv));

    }

}
