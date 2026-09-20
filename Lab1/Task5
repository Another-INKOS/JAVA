package edu.course.lab1;

public class Pal {
    public static boolean isPalindrome(String s) {
        int i = 0; //Значение символа слева
        int j = s.length() - 1; //Значение символа справа

        while (i < j) { //Пока не сошлись
            char leftChar  = s.charAt(i); //Подбор символов
            char rightChar = s.charAt(j);

            if (!Character.isLetterOrDigit(leftChar)) { //Если символ слева не буква и не цифра
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) { //Если символ справа не буква и не цифра
                j--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) { //Если буквы не равны то выводит false
                return false;
            }

            i++; //в ином случае продолжаем сдвигаться и повторяем цикл
            j--;
        }

        return true;
    }
}
