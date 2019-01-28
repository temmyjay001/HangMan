/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HangManGame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author OPEYEMI
 */
public class GameWindow extends JFrame implements ActionListener,KeyListener{
    int count, len, rnd, flag, chance;
    String word[] = {"JAPAN","NIGERIA","CANADA","CHINA","DENMARK","GERMANY","BRAZIL","GHANA","TOGO","MAURITIUS"};
    Random rd;
    StringBuffer blanks;
    JButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    JLabel lblword,lblmessage;
    JPanel keypad,key1,key2,key3,screen,notify;
    
    public GameWindow(){
        count = 0;
        chance = 0;
        rd = new Random();
        blanks = new StringBuffer();
        a = new JButton("A");
        a.addActionListener(this); 
        a.addKeyListener(this);
        b = new JButton("B");
        b.addActionListener(this);
        b.addKeyListener(this);
        c = new JButton("C");
        c.addActionListener(this);
        c.addKeyListener(this);
        d = new JButton("D");
        d.addActionListener(this);
        d.addKeyListener(this);
        e = new JButton("E");
        e.addActionListener(this);
        e.addKeyListener(this);
        f = new JButton("F");
        f.addActionListener(this);
        f.addKeyListener(this);
        g = new JButton("G");
        g.addActionListener(this);
        g.addKeyListener(this);
        h = new JButton("H");
        h.addActionListener(this);
        h.addKeyListener(this);
        i = new JButton("I");
        i.addActionListener(this);
        i.addKeyListener(this);
        j = new JButton("J");
        j.addActionListener(this);
        j.addKeyListener(this);
        k = new JButton("K");
        k.addActionListener(this);
        k.addKeyListener(this);
        l = new JButton("L");
        l.addActionListener(this);
        l.addKeyListener(this);
        m = new JButton("M");
        m.addActionListener(this);
        m.addKeyListener(this);
        n = new JButton("N");
        n.addActionListener(this);
        n.addKeyListener(this);
        o = new JButton("O");
        o.addActionListener(this);
        o.addKeyListener(this);
        p = new JButton("P");
        p.addActionListener(this);
        p.addKeyListener(this);
        q = new JButton("Q");
        q.addActionListener(this);
        q.addKeyListener(this);
        r = new JButton("R");
        r.addActionListener(this);
        r.addKeyListener(this);
        s = new JButton("S");
        s.addActionListener(this);
        s.addKeyListener(this);
        t = new JButton("T");
        t.addActionListener(this);
        t.addKeyListener(this);
        u = new JButton("U");
        u.addActionListener(this);
        u.addKeyListener(this);
        v = new JButton("V");
        v.addActionListener(this);
        v.addKeyListener(this);
        w = new JButton("W");
        w.addActionListener(this);
        w.addKeyListener(this);
        x = new JButton("X");
        x.addActionListener(this);
        x.addKeyListener(this);
        y = new JButton("Y");
        y.addActionListener(this);
        y.addKeyListener(this);
        z = new JButton("Z");
        z.addActionListener(this);
        z.addKeyListener(this);
        
        lblmessage = new JLabel("Guess a country Name");
        lblmessage.setFont(new Font("Serif",Font.PLAIN,20));
        
        lblword = new JLabel();
        lblword.setFont(new Font("Serif",Font.PLAIN,35));
        
        
        notify = new JPanel();
        notify.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        
        screen = new JPanel();
        screen.setBackground(Color.WHITE);
        screen.setSize(0, 200);
        
        keypad = new JPanel();
        keypad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
        keypad.setBackground(Color.BLACK);
        
        key1 = new JPanel();
        key1.setBackground(Color.BLACK);
        
        key2 = new JPanel();
        key2.setBackground(Color.BLACK);
        
        key3 = new JPanel();
        key3.setBackground(Color.BLACK);
        
        setTitle("Hangman Game");
        setSize(500,450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void addComponent(){
        GridBagConstraints gc = new  GridBagConstraints();
        
        notify.setLayout(new FlowLayout());
        notify.add(lblmessage);
        
        screen.setLayout(new GridBagLayout());
        screen.add(lblword,gc);
        
        keypad.setLayout(new GridBagLayout());
        
        key1.setLayout(new GridBagLayout());
        key1.add(q);
        key1.add(w);
        key1.add(e);
        key1.add(r);
        key1.add(t);
        key1.add(y);
        key1.add(u);
        key1.add(i);
        key1.add(o);
        key1.add(p);
        
        gc.gridx = 0;
        gc.gridy = 0;
        keypad.add(key1,gc);
                
        key2.setLayout(new GridBagLayout());
        key2.add(a);
        key2.add(s);
        key2.add(d);
        key2.add(f);
        key2.add(g);
        key2.add(h);
        key2.add(j);
        key2.add(k);
        key2.add(l);
        
        gc.gridx = 0;
        gc.gridy = 1;
        keypad.add(key2,gc);
        
        key3.setLayout(new GridBagLayout());
        key3.add(z);
        key3.add(x);
        key3.add(c);
        key3.add(v);
        key3.add(b);
        key3.add(n);
        key3.add(m);
        
        gc.gridx = 0;
        gc.gridy = 2;
        keypad.add(key3,gc);
        
        setLayout(new BorderLayout());
        add(notify,BorderLayout.NORTH);
        add(screen,BorderLayout.CENTER);
        add(keypad,BorderLayout.SOUTH);
        
    }
    
    public void startGame(){
         addComponent();
         rnd = rd.nextInt(10);
         len = word[rnd].length();// this code is used to make the words in word random........
         
         for(int j = 0; j<len; j++){
             blanks.append("_  ");
         }
         lblword.setText(blanks.toString());
    }
    
    public void actionPerformed(ActionEvent e){
         
        JButton jb = (JButton) e.getSource();
        String letter = e.getActionCommand();
        
        flag =0;
       
        for(int loop = 0; loop<len;loop++){
            if (letter.charAt(0) == word[rnd].charAt(loop)){
                flag = 1;
                blanks.replace((loop *3),((loop*3)+ 1), letter);
                count++;
            }   
        }
        if (flag ==1){
            lblword.setText(blanks.toString());
            jb.setBackground(Color.GREEN);
            jb.setEnabled(false);
        }
        else{
            jb.setBackground(Color.RED);
            jb.setEnabled(false);
            chance++;
        }
        if(count == len){
            JOptionPane.showMessageDialog(this,"COngrats! You guessed the word correctly");
            int n = JOptionPane.showConfirmDialog(this,"Do you want to play again?","Restart Game",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
            if(n == JOptionPane.YES_NO_OPTION){
                GameWindow gw = new GameWindow();
                gw.startGame();
                this.dispose();
            }
            else{
                this.dispose();
                Menu me = new Menu();
                me.addComponent();
            }
        }
        if(chance > 5){
            JOptionPane.showMessageDialog(this,"Sorry, You Lost Your Chances");
            int n = JOptionPane.showConfirmDialog(this,"Do you want to play again?","Restart Game",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            
                if(n == JOptionPane.YES_OPTION){
                    GameWindow gw = new GameWindow();
                    gw.startGame();
                    this.dispose();
                }
                else{
                    this.dispose();
                    Menu mu = new Menu();
                    mu.addComponent();
                }
        }
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    public void keyReleased(KeyEvent e){
        
    }
    public void keyTyped(KeyEvent e){
        
    }
    
    
    public static void main(String[] args){
        GameWindow gw  = new GameWindow();
        
        gw.addComponent();
    }

   
}
