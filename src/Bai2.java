import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
    public class Bai2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a[] = new int[4];
            int max = a[0];
            int min = a[1];
            for(int i = 0; i < 4; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < 4; i++){
                if(a[i] >= max){
                    max = a[i];
                }
                if(a[i] <= min){
                    min = a[i];
                }
            }
            int max2 = min;
            for(int i = 0; i < 4; i++){
                if(a[i] >= max2 && a[i] < max){
                    max2 = a[i];
                }
            }
            if(a[0] == a[1] && a[0] == a[2] && a[0] == a[3]){
                System.out.println("Khong co so lon thu hai");
            }else{
                System.out.println(max2);
            }


        }

}
