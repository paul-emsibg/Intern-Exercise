public class Calculator {


    public static double add(double a, double b) {
        return a+b;
    }

    public static double sub(double a, double b) {
        return a-b;
    }

    public static double multiple(double a, double b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        if(b!=0){
            return a/b;
        }
        else{
            throw new IllegalArgumentException("Cant divide");
        }
    }
}
