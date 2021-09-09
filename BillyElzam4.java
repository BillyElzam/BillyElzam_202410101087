import java.util.Arrays;
public class BillyElzam4 {

    public static void main(String[]args){
        int[] WiroSableng = {6,4,3};
        int[] veldora = {8,1};
        Arrays.sort(WiroSableng);
        Arrays.sort(veldora);
        int indeksVeldora= 0;
        int kekuatan = 0;
        for(int x : WiroSableng){
            if(indeksVeldora < veldora.length){
                if(x >= veldora[indeksVeldora]){
                    kekuatan += x;
                    indeksVeldora++;
                }
            }
        }
        if(indeksVeldora == veldora.length){
            System.out.println("Minimum Height : "+ kekuatan);
        }  else {
            System.out.println("Knight Fall");
        }
    }
}
    

