import java.util.Scanner;
public class BillyElzam1 {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka : ");
        int angka = input.nextInt();

        boolean prima = true;
        for(int index=2; index<=angka/2; index++){
            if(angka%index ==0){
                prima = false;
                break;
        
        
            }
        }
            if(prima && ((angka > 0)&&(angka != 1)))
                System.out.println(angka+ " merupakan bilangan prima");
            else
                System.out.println(angka+ " bukanlah bilangan prima");
        input.close();

        }
    }