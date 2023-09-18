import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1)); // true
        System.out.println(shouldWakeUp(false,2)); // false
        System.out.println(shouldWakeUp(true,-1)); // false
        System.out.println("*******************************");
        System.out.println(hasTeen(9,99,19)); //True
        System.out.println(hasTeen(23,15,42)); //True
        System.out.println(hasTeen(22,23,34)); //False
        //
        System.out.println(isCatPlaying(true,10)); // False
        System.out.println(isCatPlaying(false,36)); // False
        System.out.println(isCatPlaying(false,35)); // True
        System.out.println("*******************************");
        Scanner inputValues = new Scanner(System.in);
        boolean isValid = true;
        while (isValid){
            try {
                System.out.println("Enter your first number: ");
                double num1 = inputValues.nextDouble();
                System.out.println("Enter your second number: ");
                double num2 = inputValues.nextDouble();
                System.out.println("Area: " + area(num1,num2));
            }catch (Exception ex){
                System.out.println("Invalid Input");
                isValid= false;
            }
        }

        System.out.println("*******************************");
        Scanner radiusValue = new Scanner(System.in);
        double radius=0;
        System.out.println("Enter your radius value: ");
        radius = radiusValue.nextDouble();
        System.out.println(area(radius));

    }

    /** BEST PRACTISE FOR shouldWakeUp
     *
     *    if(clock <0 || clock > 23) return false;
     *         if (!bark) return false;
     *         return clock < 8 || clock >= 20;
     *
     * @param bark
     * @param clock
     * @return
     */
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

    /** BEST PRACTISE FOR hasTeen
     *
     *
     *
     * @param age1
     * @param age2
     * @param age3
     * @return
     */

    public static boolean hasTeen(int age1, int age2, int age3){
        // TAMAM
        return ((age1 >12 && age1<20) || (age2 >12 && age2<20) || (age3 >12 && age3<20));
    }

public static boolean isCatPlaying (boolean season, int temprature){
// TAMAM
        boolean playing = false;
if(season){
return temprature > 25 && temprature <= 45;
}
return temprature > 25 && temprature <= 35;
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