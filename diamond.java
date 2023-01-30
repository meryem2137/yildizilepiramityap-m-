import java.util.Scanner;

public class diamond{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayı giriniz: ");
        n= input.nextInt();

        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");

            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");


            }

            System.out.println("");
            }
        for(int z=n-1; z>=1; z--){
            for(int k=n-z; k>=1; k--){
                System.out.print(" ");
            }for(int k=1; k<=2*z-1;k++){
                System.out.print("*");
        }
            System.out.println();
        }




        }






    }








//www.patika.dev



































































