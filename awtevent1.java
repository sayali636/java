import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
  Label l1,l2;
  TextField t1,t2;
  Button b1,b2,b3;
     Demo()
  {
     setVisible(true);
     setSize(500,400);
     setBackground(Color.cyan);
     setLocation(400,500);
     setTitle("AWT DEMO");
     setLayout(new GridLayout(4,2)); 
      l1=new Label("Enter no1");
     
     l2=new Label("result");
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
          int n=Integer.parseInt(t1.getText());
         
          t2.setText(""+(n*n));
       }
       if(ae.getSource()==b2)
       {
          int n=Integer.parseInt(t1.getText());
         
          t2.setText(""+(n*n*n));
       }
      if(ae.getSource()==b3)
      {
           dispose();
      }
    }
    public static void main(String arg[])
    {
       new Demo();
    }
}