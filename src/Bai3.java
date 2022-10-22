import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        for(int i = 1; i <= 20; i++){
            for(int j = 1; j <= 33; j++){
                for(int k = 1; k <= 100; k++){
                    if((i + j + k == 100) && (5*i + 3*j + k/3 == 100)){
                        System.out.println("Truong hop " + x + "\n");
                        System.out.println("Trau dung: " + i);
                        System.out.println("Trau nam: " + j);
                        System.out.println("Trau gia: " + k + "\n");
                        x++;
                    }
                }
            }
        }

    }
}
