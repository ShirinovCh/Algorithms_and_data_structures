package geekbrains.HW2;

public class MyArray {
    public static void main(String[] args){
        // to fil a random number
        int[] arr;
        arr = new int [1000];
        for (int i = 0; i < 1000; i++){
            arr[i] = ((int)(Math.random() * 1000));
            System.out.println(arr[i]);
        }
    }
}
