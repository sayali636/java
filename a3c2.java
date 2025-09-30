//Construct a Linked List containing name: red, blue, yellow and orange. Then extend
 //your program to do the following: 
//Display the contents of the List using an iterator 
//Display the contents of the List in reverse order using a ListIterator. 
//Create another list containing pink & green. Insert the elements of this list between blue  & yellow.

import java.util.*;
class Main 
{
    public static void main(String[] args) 
{
        LinkedList colors = new LinkedList();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Original LinkedList:");
        Iterator it = colors.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("\n LinkedList in reverse:");
        ListIterator lit = colors.listIterator(colors.size());
        while (lit.hasPrevious()) 
       {
            System.out.println(lit.previous());
        }

        LinkedList newColors = new LinkedList();
        newColors.add("pink");
        newColors.add("green");

           int index = colors.indexOf("yellow"); 
        colors.addAll(index, newColors); 
         System.out.println("\n  pink & green:");
        for (int i = 0; i < colors.size(); i++) 
       {
            System.out.println(colors.get(i));
        }
    }
}
 