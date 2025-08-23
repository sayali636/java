import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
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
     
     l3=new Label("result");
     t1=new TextField(10);
     t2=new TextField(10);
     
     b1=new Button("square");
     b2=new Button("cube");
     b3=new Button("Exit");
     add(l1);add(t1);
     add(l2);add(t2);
     add(b1);add(b2);add(b3);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);

  }
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==b1)
       {
          int a=Integer.parseInt(t1.getText());
          int b=Integer.parseInt(t2.getText());
          t3.setText(""+(a+b));
       }
      if(ae.getSource()==b2)
      {
           dispose();
      }
    }
    public static void main(String arg[])
    {
       new Demo();
    }
}