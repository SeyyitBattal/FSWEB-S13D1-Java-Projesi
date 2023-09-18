public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19)); //True
        System.out.println(hasTeen(23,15,42)); //True
        System.out.println(hasTeen(22,23,34)); //False
        System.out.println(isCatPlaying(true,10)); // False
        System.out.println(isCatPlaying(false,36)); // False
        System.out.println(isCatPlaying(false,35)); // True
    }

    /**
     *     System.out.println(shouldWakeUp(false, -4));
     *
     *        public static boolean shouldWakeUp(boolean bark, int clock) {
     *         // EKSİK
     *        if( clock > -1 && clock < 24){
     *            System.out.println("Saat degeri dogru");
     *        }
     *       }else{
     *           System.out.println("Saat degeri dogru degil");
     *       }
     *       return bark;
     *    }
     * @param
     * @param
     * @return
     */

    public static boolean hasTeen(int age1, int age2, int age3){
        // TAMAM
boolean ages = false;
        if((age1 >12 && age1<20) || (age2 >12 && age2<20) || (age3 >12 && age3<20)){
ages = true;
        }
        return ages;
    }

public static boolean isCatPlaying (boolean season, int temprature){
// TAMAM
        boolean playing = false;
if(season && temprature > 24 && temprature < 46 ){
playing = true;
} else if (!season && temprature > 24 && temprature < 36 ) {
    playing = true;
}else{
    playing = false;
}

    return playing;
}





}