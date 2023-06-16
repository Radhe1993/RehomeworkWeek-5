package homework;

import java.util.ArrayList;

/**
 * Created by Jay Vaghani
 */
/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */

public class Programme_4 {
    public static void main(String[] args) {
        ArrayList<String> colourList = new ArrayList<>();
        {
            colourList.add("RED");
            colourList.add("Blue");
            colourList.add("Green");
            colourList.add("Yellow");
            colourList.add("BLACK");
            colourList.add("WHITE");
            colourList.add("ORANGE");
            colourList.add("PURPLE");
            colourList.add("CYAN");
            for (String colorList : colourList) {
                System.out.println(colorList + " , ");
            }
        }
    }
}




