
import game.*;

public class TestGame
 {
    public static void main(String[] args)
 {
        indoor in = new indoor();               
        outdoor out = new outdoor("Kho-Kho");  

        in.display();
        out.display();
    }
}
