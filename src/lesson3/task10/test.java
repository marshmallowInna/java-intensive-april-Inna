package lesson3.task10;


public class test {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 2, 7};
        sum(arr);
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
        }

    }

}




