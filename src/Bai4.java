import java.util.Scanner;
import java.lang.Math;
    public class Bai4 {
        public static int SCP(long n){
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(i*i == n) return 1;
            }
            return 0;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            do{
                n = sc.nextInt();
            }while(n <= 0);

            int dem = 0;
            int b[] = new int[100];
            int x = 0;
            while(n > 0){
                int du = n % 10;
                if(SCP(du) == 1){
                    b[x] = du;
                    x++;
                    dem++;
                }
                n = n/10;
            }
            if(dem == 0){
                System.out.println("No");
            }else{
                for(int i = x - 1; i >= 0; i--){
                    System.out.print(b[i] + " ");
                }
            }
        }
    }
