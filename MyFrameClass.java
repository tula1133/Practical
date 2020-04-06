import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame
{
    MyFrame()
    {
        Button b = new Button("Submit");
        Choice cb = new Choice();
        Frame f = new Frame("MyColorFrame");
        f.setBounds(50,50,600,600);
        cb.add("CYAN");
        cb.add("BLUE");
        cb.add("GREEN");
        cb.add("YELLOW");
        cb.setBounds(150,50,400,400);
        b.setBounds(25,50,100,50);
        f.add(b);
        f.add(cb);
            b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            String str = cb.getItem(cb.getSelectedIndex());  
            if(str.equals("CYAN"))
            f.setBackground(Color.CYAN);
            else if(str.equals("BLUE"))
                f.setBackground(Color.BLUE);
            else if(str.equals("GREEN"))
                f.setBackground(Color.GREEN);
            else if(str.equals("YELLOW"))
                f.setBackground(Color.YELLOW);
            else
                f.setBackground(Color.WHITE);
    }  
    });  
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
public class MyFrameClass {
  
    public static void main(String[] args)
  {
      MyFrame my = new MyFrame();
  }        
}
