package geekbrains.HW2;

import java.util.Arrays;

public class MyArray {


    public static void main(String[] args) {
        //create big array and link saved
        int[] arr = new int[1000];
        //fill a random number
        for (int i = 0; i < 1000; i++) {
            arr[i] = ((int) (Math.random() * 1000));
        }
        System.out.println("Array size: " + arr.length + " value");
        srchDltNmbr();
    }

    //search and delete number
    public static void srchDltNmbr() {

        int[] arr = new int[1000];
        int i;
        int len = arr.length;
        int search = 305;

        /*for (int i = 0; i < 1000; i++) {
            arr[i] = ((int) (Math.random() * 1000));
            System.out.println(arr.length);
        }*/

        for (int j = 0; j < len; j++) {
            arr[j] = ((int) (Math.random() * 1000));
            System.out.print(arr[j]);
        }


        for (i = 0; i < len; i++) {
            if (arr[i] == search) break;
        }


        for (int j = i; j < len - 1; j++) {
            arr[j] = arr[j + 1];
        }

        len--;

        System.out.println();
        for (int j = 0; j < len; j++) {
            System.out.print(arr[j]);
        }
    }
}
