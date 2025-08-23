import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener 
{
  Label l1,l2;
  TextField t1;
  List lst1;
  Button b1,b2,b3,b4;
  Demo()
  {
    setVisible(true);
    setSize(500,300);
    setBackground(Color.pink);
    setTitle("CDJ College Project");
    setLocation(100,500);
    setLayout(new GridLayout(4,2));
    l1=new Label("Enter Product:");
    l2=new Label("All Product:");
    t1=new TextField(10);
    lst1=new List();
    b1=new Button("Add");
    b2=new Button("Remove");
    b3=new Button("clear");
    b4=new Button("Exit"); 
    add(l1); add(t1);
    add(l2); add(lst1);
    add(b1); add(b2); add(b3); add(b4);
  b1.addActionListener(this);  
  b2.addActionListener(this);  
  b3.addActionListener(this);  
  b4.addActionListener(this);  
 }
   public void actionPerformed(ActionEvent ae)
  {
    if(ae.getSource()==b1)
    {
         String s1=t1.getText();
         lst1.add(s1);
    }
    if(ae.getSource()==b2)
    {
      lst1.remove(lst1.getSelectedItem());
    }
    if(ae.getSource()==b3)
    {
      lst1.removeAll();
    }
    if(ae.getSource()==b4)
    { 
      dispose();
    }
  }
   public static void main(String arg[])
   {
      new Demo();
   } 
}