
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.swing.RowFilter.Entry;
import javax.swing.SwingWorker;

/**
 *
 * @author ok
 */
public  class HighScore {
    private static ArrayList<Integer> highscores=new ArrayList<Integer>();
    private static ArrayList<String> names = new ArrayList<String>();
 
  public  static void add(int seconds , String name){
//int size = highscores.size();

boolean isless=false;
//highscores.add(2);
        for(int i =0;i<highscores.size();i++){
              if(seconds<=highscores.get(i)){
                  highscores.add(i, seconds);
                  names.add(i,name);
            isless=true;
            break;
              }
   }
      
        if(!isless){
            
        if(highscores.size()!=5){
            System.out.println("This condition becomes true");
        
            highscores.add(seconds);
         names.add(name);
        }
        }
        if(highscores.size()==6){
        highscores.remove(highscores.size()-1);
        names.remove(names.size()-1)
                ;
        }
           System.out.println(names);
    System.out.println(highscores);
//Menu.Name1.setText(names.get(names.size()-1));
        ;
 
  }

static int i = 0;
static void sn (String name){


}
}        
  




