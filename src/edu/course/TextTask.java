package edu.course.lab1;

public class TextTask {
    public static String reverse (String s){
        String result = "";
        for (int i = s.length()-1; i>=0; i--){
            result += s.charAt(i);
        }
        return result;
    }
}
