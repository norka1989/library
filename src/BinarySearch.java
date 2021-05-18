import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int x = 87; //число,которое надо найти
        int[] massiv = {5, 7, 1, -8, 7, 10,6,13,87,34};
        Arrays.sort(massiv);
        System.out.println(Arrays.toString(massiv));
        System.out.println("-------------------");
        System.out.println("Поиск элемента через рекурсивный метод");
        System.out.println("индекс элемента = "+BinSearch(0, massiv.length - 1, massiv, x));
        System.out.println("Поиск элемента через метод с циклом");
        System.out.println("индекс элемента = "+search( massiv, x));
        int result=1;


    }
//способ через рекурсию
    public static int BinSearch(int start, int end, int[] massiv, int x) {
        int middle = (end + start) / 2;
        int result;
        if (end<start) return -1;
        if (x<massiv[start]||x>massiv[end]) return -1;
        if (massiv[middle] == x) return middle;
        else if (massiv[middle] > x) {
            return BinSearch(0, middle-1, massiv, x);
        } else if (massiv[middle] < x) {
            return BinSearch(middle+1, end, massiv, x);
        }
        result = -1;
        return result;
    }
    //способ через цикл
    public static int search (int [] massiv,int x){
        int start=0,end=massiv.length-1;
        if (x<massiv[0]||x>massiv[massiv.length-1]) return -1;
        for(;;){
            int center=(start+end)/2;
            if (x==massiv[center]) return center;
            else if (x<massiv[center]){
                end=center-1;
            } else if (x>massiv[center]){
                start=center+1;
                }
        }
    }

    public static int fact(int x){
        if (x==1) return 1;
        else return x*fact(x-1);
    }
}








