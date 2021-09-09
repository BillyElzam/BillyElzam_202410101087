public class BillyElzam3 {

    public static void main(String[]args){
        int angka[] = {1,5,7,9,10,13,16};
        int kunci = 9;
        int index = angka.length / 2;
        boolean ditemukan = false;
        int tengah = index;

        while (index >= 0 && index < angka.length  && ditemukan == false ){
            if(kunci== angka[index]){
                System.out.println("Data ditemukan pada index ke-" + index);
                ditemukan = true;
            }  else {
                if(kunci < angka[tengah]){
                    index--;
                }else{
                    index++;       
                    
                }
                
            }
        }
        if(ditemukan == false){
            System.out.println("Data tidak ditemukan");
        }
    }
}
