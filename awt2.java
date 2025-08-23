import java.awt.*;

class Demo extends Frame
{
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2;
     Demo()
  {
     setVisible(true);
     setSize(500,400);
     setBackground(Color.cyan);
     setLocation(400,500);
     setTitle("AWT DEMO");
     setLayout(new GridLayout(4,2)); 
      l1=new Label("Enter no1");
     l2=new Label("Enter no2");
     l3=new Label("Addition");
     t1=new TextField(10);
     t2=new TextField(10);
     t3=new TextField(10);
     b1=new Button("Add");
     b2=new Button("Exit");
     add(l1);add(t1);
     add(l2);add(t2);
     add(l3);add(t3);
     add(b1);add(b2);
  }
  
    public static void main(String arg[])
    {
       Demo d=new Demo();
    }
}