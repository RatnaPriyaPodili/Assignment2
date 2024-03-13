package Assignment2;

public class Divisibility {
	public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;

        for (int v : values) {
            if (v % 5 == 0 && v % 2 == 0) {
                sum += v;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }

}
