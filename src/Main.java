import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1)); // true
        System.out.println(shouldWakeUp(false,2)); // false
        System.out.println(shouldWakeUp(true,-1)); // false
        //
        System.out.println(hasTeen(9,99,19)); //True
        System.out.println(hasTeen(23,15,42)); //True
        System.out.println(hasTeen(22,23,34)); //False
        //
        System.out.println(isCatPlaying(true,10)); // False
        System.out.println(isCatPlaying(false,36)); // False
        System.out.println(isCatPlaying(false,35)); // True
        //
        Scanner inputValues = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        System.out.println("Enter your first number: ");
        num1 = inputValues.nextDouble();
        System.out.println("Enter your second number: ");
        num2 = inputValues.nextDouble();
        System.out.println(area(num1,num2));
        //
        Scanner radiusValue = new Scanner(System.in);
        double radius=0;
        System.out.println("Enter your radius value: ");
        radius = radiusValue.nextDouble();
        System.out.println(area(radius));

    }


    public static boolean shouldWakeUp (boolean bark, int clock){
boolean cvp = false;

if(clock > 0 && clock < 24){
    if ((clock < 8 || clock > 20) && bark){
cvp= true;
    }
    else {
        cvp = false;
    }

} else {
    cvp = false;
}

return cvp;
    }

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

public static double area (double num1, double num2){
        //TAMAM
       double answer = num1 * num2;
if(answer < 0){
    System.out.println("Your numbers are wrong");
    answer = -1;
}
return answer;
}


public static double area(double radius){
        // TAMAM
double answer2=0;

if(radius <0){
    System.out.println("Radius value should be bigger than 0");
    answer2 = -1;
}else{
    answer2 = radius*radius*Math.PI;
}
return answer2;
}

}