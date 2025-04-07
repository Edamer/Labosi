package hr.fer.oop;

public class LabArray {
    public static void increasing(int[] arr) {
        int counter = 0;
        arr[0] = (int) (Math.random() * (9 - 1) + 1);
        counter++;
        while (counter < arr.length) {
            arr[counter] = (int) (Math.random() * (arr[counter - 1] * 2 - arr[counter - 1]) + arr[counter - 1]);
            counter++;
        }
    }

}
