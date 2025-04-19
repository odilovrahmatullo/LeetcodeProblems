package problems.converTemperature;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(convertTemperature(16.9)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[1] = 1.80 * celsius + 32.00;
        arr[0] = celsius + 273.15;
        return arr;
    }
}
