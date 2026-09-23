package edu.course.lab1;

public class SQRT {
    public static void solve(Double a, Double b, Double c){
        if (a == 0){
            System.out.println("Ты дурачок? Это не квадратное уравнение");
            return;
        }
        double Disc = (b*b - 4*a*c);
        if (Disc > 0){
            double x1 = (-b + Math.sqrt(Disc))/(2*a);
            double x2 = (-b - Math.sqrt(Disc))/(2*a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if (Disc == 0){
            double x = -b/(2*a);
            System.out.println("x = " + x);
        }
        if (Disc < 0){
            System.out.println("Корней нет");
        }
    }
}
