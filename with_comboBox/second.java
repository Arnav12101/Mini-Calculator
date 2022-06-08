import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class second extends JFrame implements ActionListener
{

    JTextField firstnum, secondnum, result, menu;
    JLabel optionstring;
    JButton execute;
    JComboBox options;
    
    second()//CONSTRUCTOR
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
        
        optionstring = new JLabel("Select the operation: ");
        optionstring.setBounds(100,250,250,50);
        optionstring.setFont(new Font("Osward", Font.BOLD, 25));
        add(optionstring);
        
         menu = new JTextField("Select the following operations");
         String operations[] = {"ADD","SUBTRACT","MULTIPLY","DIVIDE"};
         options = new JComboBox(operations);
         options.setBounds(350, 260, 250, 30);
         add(options);
//         options.setBounds();
        
        
        JLabel newres = new JLabel("Result: ");
        newres.setBounds(100,380,500,65);
        newres.setFont(new Font("Osward", Font.BOLD, 38));
        add(newres);
        
            result = new JTextField();
            result.setBounds(250,400,260,33);
            result.setFont(new Font("Osward", Font.BOLD, 38));
            add(result);
            
            execute = new JButton("Execute");
        execute.setBounds(250,325,200, 50);
        add(execute);
        execute.addActionListener(this);
        
        setSize(800,600);
        setVisible(true);
        setLocation(350, 200);
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(firstnum.getText());
        int b = Integer.parseInt(secondnum.getText());
        int answer=0;
        
        String optionvalue = (String)options.getSelectedItem();
        if(optionvalue.equals("ADD"))
        {
            answer = a+b;
            result.setText(String.valueOf(answer));
        }
        else if(optionvalue.equals("SUBTRACT"))
        {
            answer = a-b;
           result.setText(String.valueOf(answer));
        }
        else if(optionvalue.equals("MULTIPLY"))
        {
            answer = a*b;
           result.setText(String.valueOf(answer));
        }
        else if(optionvalue.equals("DIVIDE"))
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
        new second();
    }    
}
