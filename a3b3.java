//Construct a Linked List containg name: CPP, Java, Python and PHP. Then extendyour 
//program to do the following: 
//i. Display the contents of the List using an iterator 
//ii.Display the contents of the List in reverse order using a ListIterator. 

import java.util.*;

class Main
 {
    public static void main(String[] args)
 {
        LinkedList languages = new LinkedList();  
        languages.add("CPP");
        languages.add("Java");
        languages.add("Python");
        languages.add("PHP");

        System.out.println("LinkedList contents:");
        Enumeration e = Collections.enumeration(languages);
        while (e.hasMoreElements()) 
         {
            System.out.println(e.nextElement());
        }


        System.out.println("\nLinkedList in reverse:");
        for (int i = languages.size() - 1; i >= 0; i--) 
         {
            System.out.println(languages.get(i));
        }
    }
}
