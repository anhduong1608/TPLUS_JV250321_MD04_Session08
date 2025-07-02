//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int number = 5;
        int number1 = 10;
        int totalCost = total(number, number1);
        System.out.println("Result:" + totalCost);
    }

    public static int total(int number, int number1) {
        return number * number1 + (number + number1);
    }
}

