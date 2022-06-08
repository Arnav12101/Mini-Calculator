import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class first extends JFrame implements ActionListener{
    
    JTextField firstnum, secondnum,result;
    JButton addnum, subtract, prod, div;
    first()//CONSTRUCTOR
    {
        setTitle("First question");
        setLayout(null);
        
        JLabel text = new JLabel("Please enter 2 integers");
        text.setBounds(150,40,500,65);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        add(text);
        
        
        firstnum = new JTextField();
        firstnum.setBounds(100,150,260,40);
        firstnum.setFont(new Font("Osward", Font.BOLD, 38));
        add(firstnum);
        
        secondnum = new JTextField();
        secondnum.setBounds(450,150,260,40);
        secondnum.setFont(new Font("Osward", Font.BOLD, 38));
        add(secondnum);
        
         addnum = new JButton("ADD");
        addnum.setBounds(100,250,100, 50);
        add(addnum);
        addnum.addActionListener(this);
        
         subtract = new JButton("SUBTRACT");
        subtract.setBounds(250,250,100, 50);
        add(subtract);
        subtract.addActionListener(this);
        
         prod = new JButton("MULTIPLY");
        prod.setBounds(400,250,100, 50);
        add(prod);
        prod.addActionListener(this);
        
         div = new JButton("DIVIDE");
        div.setBounds(550,250,100, 50);
        add(div);
        div.addActionListener(this);
        
        
        JLabel newres = new JLabel("Result: ");
        newres.setBounds(100,380,500,65);
        newres.setFont(new Font("Osward", Font.BOLD, 38));
        add(newres);
        
         result = new JTextField();
        result.setBounds(250,400,260,33);
        result.setFont(new Font("Osward", Font.BOLD, 38));
        add(result);
        
        setSize(800,600);
        setVisible(true);
        setLocation(350, 200);
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(firstnum.getText());
        int b = Integer.parseInt(secondnum.getText());
        int answer=0;
        
        if(e.getSource().equals(addnum))
        {
           answer = a+b;
           result.setText(String.valueOf(answer));
        }
        else if(e.getSource().equals(subtract))
        {
            answer = a-b;
           result.setText(String.valueOf(answer));
        }
        else if(e.getSource().equals(prod))
        {
            answer = a*b;
           result.setText(String.valueOf(answer));
        }
        else if(e.getSource().equals(div))
        {
            answer = a/b;
           result.setText(String.valueOf(answer));
        }
        else
        {
            System.out.println("Wrong input");
        }
    }
    
    public static void main(String args[])
    {
        new first();
    }
}
