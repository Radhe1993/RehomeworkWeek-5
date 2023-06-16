package homework;

import java.util.Arrays;

/**
 * Created by Jay Vaghani
 */
//Write a Java program to reverse an array of integer values


public class Programme_3
{
    public static void main(String[] args) {
        int[] array = new int []{23,45,34,54,67,78};//single dimension// array
        System.out.println("Original array"+ Arrays.toString(array));
        Programme_3  obj = new Programme_3();
        System.out.println("Reverse array : ");
        obj.reverseAnArray(array);

    }
    // method to revers an array
    public void reverseAnArray(int[] list)
    {
        for (int i = 0;i<(list.length)/2;i++)
        {
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
