//Write a package game which will have 2 classes Indoor & Outdoor. Use a function 
//display() to generate the list of player for the specific game. Use default & //parameterized constructor. 

import java.util.*;
class Indoor 
{
    String[] players;

    public Indoor()
   {
        players = new String[]{"Table Tennis Player", "Chess Player"};
    }
        public Indoor(String[] p)
   {
        players = p;
    }
    public void display() 
    {
        System.out.println("Indoor Players:");
        for (String player : players) 
       {
            System.out.println(player);
        }
        System.out.println();
    }
}
class Outdoor 
{
    String[] players;

        public Outdoor() 
    {
        players = new String[]{"Cricket Player", "Football Player"};
    }

    
    public Outdoor(String[] p) 
   {
        players = p;
    }

    public void display() 
{
        System.out.println("Outdoor Players:");
        for (String player : players) 
       {
            System.out.println(player);
        }
        System.out.println();
    }
}
 class Main
 {
    public static void main(String[] args)
 {
        // Using default constructors
        Indoor indoorGame = new Indoor();
        Outdoor outdoorGame = new Outdoor();

        indoorGame.display();
        outdoorGame.display();

        // Using parameterized constructors
        String[] customIndoor = {"Badminton Player", "Snooker Player"};
        String[] customOutdoor = {"Hockey Player", "Basketball Player"};

        Indoor indoorCustom = new Indoor(customIndoor);
        Outdoor outdoorCustom = new Outdoor(customOutdoor);

        indoorCustom.display();
        outdoorCustom.display();
    }
}

