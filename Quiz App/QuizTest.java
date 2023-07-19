package com.mycompany.quizapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizTest extends JFrame implements ActionListener
{
    JLabel l1;
    JRadioButton radioButtons[]= new JRadioButton[5];
    JButton bt1,bt2;
    ButtonGroup btg;
    
    int count=0, current=0, x=1, y=1, now=0;
    
    int m[]=new int[10];
    
    QuizTest()
    {
        super("Quiz App");
        
        l1=new JLabel();
        add(l1);
        btg=new ButtonGroup();
        
        for(int i=0;i<5;i++)
        {
            radioButtons[i]=new JRadioButton();
            add(radioButtons[i]);
            
            btg.add(radioButtons[i]);            
        }
        
        bt1=new JButton("Next");
        bt2=new JButton("Result");
        
        bt2.setVisible(false);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        add(bt1);
        add(bt2);
        
        setData();
        
        l1.setBounds(30,40,450,20);
        radioButtons[0].setBounds(50,80,450,20);
        radioButtons[1].setBounds(50,110,200,20);
        radioButtons[2].setBounds(50,140,200,20);
        radioButtons[3].setBounds(50,170,200,20);
        
        bt1.setBounds(100,240,100,30);
        bt2.setBounds(270,240,100,30);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }
    
    void setData()
    {
        radioButtons[4].setSelected(true);
        
        if(current==0)
        {
            l1.setText("Q1 : Which is the official language for Android Development?");
            radioButtons[0].setText("Java");
            radioButtons[1].setText("Kotlin");
            radioButtons[2].setText("C++");
            radioButtons[3].setText("Javascript");
        }
        
        if(current==1)
        {
            l1.setText("Q2 : Number of primitive datatypes in Java?");
            radioButtons[0].setText("6");
            radioButtons[1].setText("7");
            radioButtons[2].setText("8");
            radioButtons[3].setText("9");
        }
        
        if(current==2)
        {
            l1.setText("Q3 : What is the size of float and double in Java?");
            radioButtons[0].setText("32 and 64");
            radioButtons[1].setText("32 and 32");
            radioButtons[2].setText("64 and 64");
            radioButtons[3].setText("64 and 32");
        }
        
        if(current==3)
        {
            l1.setText("Q4 : Automatic type conversion is possible in which of the possible cases?");
            radioButtons[0].setText("Byte to int");
            radioButtons[1].setText("Int to long");
            radioButtons[2].setText("Long to int");
            radioButtons[3].setText("Short to int");
        }
        
        if(current==4)
        {
            l1.setText("Q5 : Arrays in Java are-");
            radioButtons[0].setText("Object references");
            radioButtons[1].setText("objects");
            radioButtons[2].setText("Primitive data type");
            radioButtons[3].setText("None");
        }
        
        if(current==5)
        {
            l1.setText("Q6 : When is the object created with new keyword?");
            radioButtons[0].setText("At run time");
            radioButtons[1].setText("At compile time");
            radioButtons[2].setText("Depends on the code");
            radioButtons[3].setText("None");
        }
        
        if(current==6)
        {
            l1.setText("Q7 : compareTo() returns");
            radioButtons[0].setText("True");
            radioButtons[1].setText("False");
            radioButtons[2].setText("An int value");
            radioButtons[3].setText("None");
        }
        
        if(current==7)
        {
            l1.setText("Q8 : Total constructor string class have?");
            radioButtons[0].setText("3");
            radioButtons[1].setText("7");
            radioButtons[2].setText("13");
            radioButtons[3].setText("20");
        }
        
        if(current==8)
        {
            l1.setText("Q9 : Identify the modifier which cannot be used for constructor.");
            radioButtons[0].setText("public");
            radioButtons[1].setText("protected");
            radioButtons[2].setText("private");
            radioButtons[3].setText("static");
        }
        
        if(current==9)
        {
            l1.setText("Q10 : What is Runnable?");
            radioButtons[0].setText("Abstract Class");
            radioButtons[1].setText("Interface");
            radioButtons[2].setText("Class");
            radioButtons[3].setText("Method");
        }
             
        l1.setBounds(30,40,450,20);
        
        for(int i=0,j=0;i<=90;i+=30,j++)
        {
            radioButtons[j].setBounds(50,80+i,200,20);
        }
    }
    
    boolean checkAns()
    {
        if(current==0)
        {
            return (radioButtons[1].isSelected());
        }
        
        if(current==1)
        {
            return (radioButtons[2].isSelected());
        }
        
        if(current==2)
        {
            return (radioButtons[1].isSelected());
        }
        
        if(current==3)
        {
            return (radioButtons[1].isSelected());
        }
        
        if(current==4)
        {
            return (radioButtons[1].isSelected());
        }
        
        if(current==5)
        {
            return (radioButtons[0].isSelected());
        }
        
        if(current==6)
        {
            return (radioButtons[2].isSelected());
        }
        
        if(current==7)
        {
            return (radioButtons[2].isSelected());
        }
        
        if(current==8)
        {
            return (radioButtons[3].isSelected());
        }
        
        if(current==9)
        {
            return (radioButtons[1].isSelected());
        }
        
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            if(checkAns())
            {
                count++;
            }
            current++;
            
            setData();
            
            if(current==9)
            {
                bt1.setEnabled(false);
                bt2.setVisible(true);
                bt2.setText("Result");
            }
        }
        
        if(e.getActionCommand().equals("Result"))
        {
            if(checkAns())
            {
                count++;
            }
            
            current++;
            
            JOptionPane.showMessageDialog(this,"Correct Answers are "+count);
            System.exit(0);
        }
    }
    
    public static void main(String[] args) 
    {
        new QuizTest().setVisible(true);
    }
}
