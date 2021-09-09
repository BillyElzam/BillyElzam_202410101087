public class BIllyElzam2 {

    public static void main(String[]args) {
        int [] bil ={2,7,16,20,23,27,56,101,244};
        System.out.print("Bilangan Genap : ");
        for(int b = 0; b < bil.length; b++){
            if(bil [b] % 2 == 0){
                System.out.print(bil[b]+ " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil : ");
        for(int b = 0; b< bil.length;b++ ){
            if(bil[b] % 2!= 0){
                System.out.print(bil[b] + " ");
            }
        }
        System.out.println("");
    }
}