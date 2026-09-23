package edu.course.lab1;

public class Sum {
    public static void run() {
        double sum = 0;
        int n = 2;
        int CountOfArrMems = 0;
        while (true) {
            double form = 1.0 / (n*n + n - 2);//сама формула
            if (Math.abs(form) < 0.000001) { //случай, при котором перестает считать
                break;
            }
            sum += form;
            CountOfArrMems++;  //Все что будет выводиться (Сама сумма, количество членов ряда и послдний n)
            n++;
        }
        System.out.println("Sum" + sum);
        System.out.println("n: " + (n - 1));
        System.out.println("Colichestvo chlenov " + CountOfArrMems);
    }
}
