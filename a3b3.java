import java.util.*;

public class LinkedListDemo
 {
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add("CPP");
        list.add("Java");
        list.add("Python");
        list.add("PHP");

        System.out.println("Using Iterator:");
        Iterator it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("\nUsing ListIterator in Reverse:");
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
    }
}
