
package neural;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;



class Point {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   
}

public class Neural extends Thread implements ActionListener {
 Color p=Color.WHITE;
 Color c=Color.WHITE;
 Color b=Color.WHITE;
int[][] board=new int[3][3];
    JFrame jf1;
    JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7,j8;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    JLabel l1,l2,l3;
    int n,n1,n2;
    int r1=-1;
    int c1=-1;
   
    public Neural(){
        
       
        jf1=new JFrame();
        jf1.setLayout(null);
        jp3=new JPanel();
        
        jp3.setBounds(10,10,280,280);
        jp3.setBackground(Color.GRAY);
        jp1=new JPanel();
        jp1.setBounds(0,0,500,500);
        jp1.setLayout(null);
         jp1.setBackground(Color.BLACK);
        
        jp2=new JPanel();
        jp2.setBounds(100,100,300,300);
        jp2.setLayout(null);
        jp1.add(jp2);
        jp2.add(jp3);
        
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        b8=new JButton();
        b9=new JButton();
        jp3.setLayout(null);
        b1.setBounds(0,0,90,90);
        b2.setBounds(95,0,90,90);
        b3.setBounds(190,0,90,90);
        b4.setBounds(0,95,90,90);
        b5.setBounds(95,95,90,90);
        b6.setBounds(190,95,90,90);
        b7.setBounds(0,190,90,90);
        b8.setBounds(95,190,90,90);
        b9.setBounds(190,190,90,90);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this); 
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this); 
        b9.addActionListener(this);
        
      
       jp3.add(b1);
       jp3.add(b2);
       jp3.add(b3);
       jp3.add(b4); 
       jp3.add(b5);
       jp3.add(b6);
       jp3.add(b7);
       jp3.add(b8);
       jp3.add(b9);
    l1=new JLabel("TIC TAC TOE");
    l1.setBounds(140,0,500,100);
    l1.setForeground(Color.WHITE);
     l1.setFont(new Font("Serif",Font.BOLD,33));
    jp1.add(l1);
        
        
       
        jp4=new JPanel();
        jp4.setBounds(0,0,500,500);
        jp4.setBackground(Color.BLACK);
        jp4.setLayout(null);
        b10=new JButton();
        b11=new JButton();
        b10.setBackground(Color.BLACK);
        b11.setBackground(Color.WHITE);
        b10.setBounds(10,10,100,100);
        b11.setBounds(10,10,100,100);
     
        b10.addActionListener(this);
        b11.addActionListener(this);
        jp5=new JPanel();
        jp6=new JPanel();
        jp5.setLayout(null);
        jp6.setLayout(null);
        jp5.setBackground(Color.WHITE);
        jp6.setBackground(Color.WHITE);
        jp5.setBounds(100,100,120,120);
        jp6.setBounds(250,100,120,120);
        jp5.add(b10);
        jp6.add(b11);
        jp4.add(jp5);
        jp4.add(jp6);
     
         l2=new JLabel("CHOOSE");
    l2.setBounds(150,0,500,100);
    l2.setForeground(Color.WHITE);
     l2.setFont(new Font("Serif",Font.BOLD,33));
        jp4.add(l2);
        
        jp7=new JPanel();
        jp7.setLayout(null);
        jp7.setBounds(150,300,200,100);
        jp7.setBackground(Color.WHITE);
        b12=new JButton("PLAY");
        b12.setBounds(10,10,180,80);
        jp7.add(b12);
        jp7.setVisible(false);
        jp4.add(jp7);
        b12.addActionListener(this);
        
        j8=new JPanel();
        j8.setLayout(null);
        j8.setBounds(0,0,500,500);
        j8.setBackground(Color.BLACK);
        j8.setVisible(false);
         jf1.add(j8);
        b13=new JButton("PLAY AGIN");
        b13.addActionListener(this);
         b13.setBounds(120,250,200,100);
         j8.add(b13);
        
       
        jf1.setSize(500,500);
       
        jf1.add(jp1);
          jf1.add(jp4);
          jp1.setVisible(false);
          jf1.setVisible(true);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
        
    }
    
    
    
    
    public void number(Object ob){
        if(ob.equals(b1)){
            n1=1;
            
        }
        
        else if(ob.equals(b2)){
            n1=2;
           
        }
        else if(ob.equals(b3)){
            n1=3;
             
        }
        else if(ob.equals(b4)){
            n1=4;
         
        }
        else if(ob.equals(b5)){
            n1=5;
           
        }
        else if(ob.equals(b6)){
            n1=6;
           
        }
        else if(ob.equals(b7)){
            n1=7;
           
        }
        else if(ob.equals(b8)){
            n1=8;
            
        }
        else if(ob.equals(b9)){
            n1=9;
            
        }
        
        
    }
    
    public void number1(int r1,int c1){
        if((r1==0&c1==0)){
            n1=1;
            
        }
        
        else if((r1==0&c1==1)){
            n1=2;
           
        }
        else if((r1==0&c1==2)){
            n1=3;
             
        }
        else if((r1==1&c1==0)){
            n1=4;
         
        }
        else if((r1==1&c1==1)){
            n1=5;
           
        }
        else if((r1==1&c1==2)){
            n1=6;
           
        }
        else if((r1==2&c1==0)){
            n1=7;
           
        }
        else if((r1==2&c1==1)){
            n1=8;
            
        }
        else if((r1==2&c1==2)){
            n1=9;
            
        }
        
        
    }
    
    public void actionPerformed(ActionEvent e){
       
      Object ob=e.getSource();
      
       
           
            if(e.getSource().equals(b10)||e.getSource().equals(b11)){
                if(e.getSource().equals(b10)){
                    
                    jp5.setBounds(175,100,120,120);
                        
                            
                    jp6.setVisible(false); 
                    p=Color.BLACK;
                    c=Color.LIGHT_GRAY;
                   
                }
                else if(e.getSource().equals(b11)){
                    
                    jp6.setBounds(225,100,120,120);
                    
                   
                   jp5.setVisible(false);
                   p=Color.LIGHT_GRAY;
                   c=Color.BLACK;
                
                }
          
           jp7.setVisible(true);
            }
            
            else if(e.getSource().equals(b12)){
                jp4.setVisible(false);
                jp1.setVisible(true);
                
            }
            else if(e.getSource().equals(b13)){
              jf1.dispose();
                Neural v=new Neural();
            }
            else{
            
            number(ob);
            back();
            }
           
             
    }
    
    
    public void back(){
        
        
        
        if(n==0){   
        n2=2;
           b=p;
         method();
          n=1;
        
            
        }
     
     if(n==1){
         
         
         
            n2=1;
            b=c;
            
         minimax(0, 1);

            placeAMove(computersMove, 1);
           
           number1(r1,c1);
         
             method();
                n=0; 
             win(board);

        }    
        
    }
    
   public void win(int[][] b){
       int f=0;
       int f1=0;
       String s=new String();
      for(int i=0;i<3;i++){
         if(b[i][0]==b[i][1]&&b[i][1]==b[i][2]){
             if(b[i][0]==2)
             {f=1;
                 s="You won";
                 
             }
             else if(b[i][0]==1){
                 f=1;
                 s="You lost";
             }
         }
      }
      for(int i=0;i<3;i++){
          
           if(b[0][i]==b[1][i]&&b[1][i]==b[2][i]){
             if(b[0][i]==2)
             {f=1;
                                s="You won";
             }
             else if(b[0][i]==1){
                 f=1;
                  s="You lost";

             }
         }
      }
      
      if(b[1][1]==b[2][2]&&b[2][2]==b[0][0]){
          if(b[1][1]==2)
             {f=1;
                                 s="You won";
             }
          else if(b[1][1]==1){
              f=1;
                 s="You lost";

             }
      }
      
       if(b[1][1]==b[2][0]&&b[2][0]==b[0][2]){
          if(b[1][1]==2)
             {f=1;
                                 s="You won";
             }
          else if(b[1][1]==1){
              f=1;
                  s="You lost";

             }
      }
       for(int i=0;i<3;i++){
           
           for(int j=0;j<3;j++){
               if(b[i][j]!=0){
                   f1=f1+1;
               }
               
           }
           
       }
       if(f1==9){
           f=1;
                   s="DRAW GAME";
       }
       
       if(f==1){
           jp3.setVisible(false);
           l3=new JLabel(s);
           
           l3.setBounds(150,0,500,100);
           l3.setForeground(Color.WHITE);
            l3.setFont(new Font("Serif",Font.BOLD,40));
           b13.setBounds(120,250,200,100);
           j8.add(l3);
           
           j8.setVisible(true);
          
       }
   }
    
    
    
    public void method(){
        
        switch(n1){
            case 1:
                board[0][0]=n2;
             b1.setVisible(false);
            JPanel l5=new JPanel(); 
            l5.setBackground(b);
            l5.setBounds(0,0,90,90);
            jp3.add(l5); 
           
           break;
        
            case 2:
                board[0][1]=n2;
                 b2.setVisible(false);
            JPanel l6=new JPanel(); 
            l6.setBackground(b);
                     l6.setBounds(95,0,90,90);
                     jp3.add(l6);  
                   break;  
                     
            case 3:
                board[0][2]=n2;
                 b3.setVisible(false);
            JPanel l7=new JPanel(); 
            l7.setBackground(b);
                     l7.setBounds(190,0,90,90);
                     jp3.add(l7);
                  
                     break;
         
            case 4:
                board[1][0]=n2;
                 b4.setVisible(false);
            JPanel l8=new JPanel(); 
            l8.setBackground(b);
                     l8.setBounds(0,95,90,90);
                     jp3.add(l8); 
                     
            break;
            case 5:
                board[1][1]=n2;
                 b5.setVisible(false);
            JPanel l9=new JPanel(); 
            l9.setBackground(b);
                     l9.setBounds(95,95,90,90);
                     jp3.add(l9);
                      
             break;
            case 6:
                board[1][2]=n2;
                 b6.setVisible(false);
            JPanel l10=new JPanel(); 
            l10.setBackground(b);
                     l10.setBounds(190,95,90,90);
                     jp3.add(l10);
                  
             break;
            case 7:
                board[2][0]=n2;
                 b7.setVisible(false);
            JPanel l11=new JPanel(); 
            l11.setBackground(b);
                     l11.setBounds(0,190,90,90);
                     jp3.add(l11);
                   
             break;
            case 8:
                board[2][1]=n2;
                 b8.setVisible(false);
            JPanel l12=new JPanel(); 
            l12.setBackground(b);
                     l12.setBounds(95,190,90,90);
                     jp3.add(l12);
                     
            break;
            case 9:
                board[2][2]=n2;
                 b9.setVisible(false);
            JPanel l13=new JPanel(); 
            l13.setBackground(b);
                     l13.setBounds(190,190,90,90);
                     jp3.add(l13);
                     
             break;
            default:
                break;}
            
        
        
        
    }
    
    
   List<Point> availablePoints;
    
  

 
   

    public boolean hasXWon() {
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == 1) || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == 1)) {
            
            return true;
        }
        for (int i = 0; i < 3; ++i) {
            if (((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == 1)
                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == 1))) {
                
                return true;
            }
        }
        return false;
    }

    public boolean hasOWon() {
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == 2) || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == 2)) {
            
            return true;
        }
        for (int i = 0; i < 3; ++i) {
            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == 2)
                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == 2)) {
                
                return true;
            }
        }

        return false;
    }

    public List<Point> getAvailableStates() {
        availablePoints = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board[i][j] == 0) {
                    availablePoints.add(new Point(i, j));
                }
            }
        }
        return availablePoints;
    }

    public void placeAMove(Point point, int player) {
        board[point.x][point.y] = player;  
        
        r1=point.x;
        c1=point.y;
    }

   
   

    Point computersMove;

    public int minimax(int depth, int turn) {
        if (hasXWon()) return +10;
        if (hasOWon()) return -10;

        List<Point> pointsAvailable = getAvailableStates();
        if (pointsAvailable.isEmpty()) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < pointsAvailable.size(); ++i) {
            Point point = pointsAvailable.get(i);
            if (turn == 1) {
                placeAMove(point, 1);
                int currentScore = minimax(depth + 1, 2);
                max = Math.max(currentScore, max);

                if(currentScore >= 0){ if(depth == 0) computersMove = point;}
                if(currentScore == 1){board[point.x][point.y] = 0; break;}
                if(i == pointsAvailable.size()-1 && max < 0){if(depth == 0)computersMove = point;}
            } else if (turn == 2) {
                placeAMove(point, 2);
                int currentScore = minimax(depth + 1, 1);
                min = Math.min(currentScore, min);
                if(min == -1){board[point.x][point.y] = 0; break;}
            }
            board[point.x][point.y] = 0; 
        }
        return turn == 1?max:min;
    }
    
    
    
    
    
  public static void main(String[] args) {
       
        
          Neural b = new Neural();    

  }
    }
    