package edu.course.lab1;

public class Main {
    public static void main(String[] args) { //
        if (args.length == 0) {
            usage();
            return;
        }

        String command = args[0];

        switch (command) {
            case "fizzbuzz":
                FizzBuzz.run();
                break;

            case "reverse":
                if (args.length < 2) {
                    usage();
                    return;
                }
                System.out.println(TextTask.reverse(args[1]));
                break;

            case "quadratic":
                if (args.length < 4) {
                    usage();
                    return;
                }
                SQRT.solve(
                        Double.parseDouble(args[1]),
                        Double.parseDouble(args[2]),
                        Double.parseDouble(args[3])
                );
                break;

            case "series":
                Sum.run();
                break;

            case "palindrome":
                if (args.length < 2) {
                    usage();
                    return;
                }
                System.out.println(Pal.isPalindrome(args[1]));
                break;

            default:
                usage();
        }
    }

    private static void usage() { //Что бы не забыть + филлер вместо ошибки
        System.out.println("  fizzbuzz");
        System.out.println("  reverse <строка>");
        System.out.println("  quadratic <a> <b> <c>");
        System.out.println("  series");
        System.out.println("  palindrome <строка>");
    }
}
