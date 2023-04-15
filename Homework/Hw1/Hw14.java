package Homework.Hw1;

public class Hw14 {
    static int quantityOfQuestions(char[] number) {
        int count = 0;
        for (char element : number)
            if (element == '?') {
                count++;
            }
        return count;
    }
    static int[] parse(String number1, String number2, String number3) {
        char[] number1Parsed = number1.toCharArray();
        int n = quantityOfQuestions(number1Parsed);
        char[] number2Parsed = number2.toCharArray();
        int m = quantityOfQuestions(number2Parsed);
        char[] number3Parsed = number3.toCharArray();
        int k = quantityOfQuestions(number3Parsed);
        
    }
    public static void main(String[] args){

    }
}
