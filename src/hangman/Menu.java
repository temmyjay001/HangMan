/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangManGame;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author OPEYEMI
 */
public class Menu  extends JFrame implements ActionListener{
    JButton option1;
    JButton option2;
    JButton option3;
    JLabel name;
    
    public Menu(){
        option1  = new JButton("Play Game");
        option1.addActionListener(this);
        option2  = new JButton("Instructions");
        option2.addActionListener(this);
        option3  = new JButton("Exit");
        option3.addActionListener(this);
        name = new JLabel("HANGMAN");
        name.setFont(new Font("serif",Font.PLAIN,24));
        
        setTitle("Hangman Game");
        setSize(300,200);
        setResizable(false);
        setVisible(true);
    }
    
    public void addComponent(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(name, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.fill = c.HORIZONTAL;
        add(option1, c);
         
        
        c.gridx = 0;
        c.gridy = 2;
        c.fill = c.HORIZONTAL;
        add(option2, c);
        
        
        c.gridx = 0;
        c.gridy = 3;
        c.fill = c.HORIZONTAL;
        add(option3, c);
    }
    
    public void actionPerformed(ActionEvent r){
        if(r.getSource() == option1){
            GameWindow gw = new GameWindow();
            gw.startGame();
        }
        else if (r.getSource() == option2){
            JOptionPane .showMessageDialog(this,"1. You can guess the word by clicking the character from the virtual keyboard."
                    + "\n2. You can select a maximum of 5 incorrect leters."
                    + "\n3. The incorrect guess will be highlighted with red color and the correct ones are highlighted with a green color","Instructions",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (r.getSource()== option3){
            System.exit(0);
        }
        
    }
    public static void main(String[]args){
        Menu m = new Menu();
        m.addComponent();
    }
}
