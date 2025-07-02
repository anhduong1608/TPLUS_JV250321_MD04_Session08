//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] marks = {7.5, 8.0, 6.5};
        double avg = average(marks);
        if (avg >= 5.0) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    // điểm trung bình
    public static double average(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }
}