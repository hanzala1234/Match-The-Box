
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ok
 */
public class Settings {
   public static Properties os = new Properties();
    public static Properties numbers = new Properties();
    void loadarray(ArrayList<String> names,ArrayList<Integer> scores ) {
       int size = names.size();
    os.clear();
       try {
           for(int i = 0;i<size;i++){
           
             
           
               if(i==0){
       os.setProperty("name1", names.get(i));
numbers.setProperty("HighScore1", String.valueOf(scores.get(i)));
               }if(i==1){
       os.setProperty("name2", names.get(i));
numbers.setProperty("HighScore2", String.valueOf(scores.get(i)));
               }
               if(i==2){
       os.setProperty("name3", names.get(i));
numbers.setProperty("HighScore3", String.valueOf(scores.get(i)));
               }
               if(i==3){
       os.setProperty("name4", names.get(i));
numbers.setProperty("HighScore4", String.valueOf(scores.get(i)));
               }
              if(i==4){
       os.setProperty("name5", names.get(i));
numbers.setProperty("HighScore5", String.valueOf(scores.get(i)));
               }
           
           }
           
           
          


    numbers.store(new FileOutputStream("numbers.propertes"), null);

           os.store(new FileOutputStream("names.propertes"), null);
 
        // numbers.store(new FileOutputStream("nohtings.properties"), null);
//os.load(new FileInputStream("config.properties"));

       } catch (IOException ex) {
       System.out.println("unexpectedly exception caught!!!");
       }
    }

 ArrayList<String> others(){
 ArrayList<String> sf = new ArrayList<String>();
       try {
           os.load(new FileInputStream("names.propertes"));
       } catch (IOException ex) {
           Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
       }
 for (Enumeration<Object> e = os.elements(); e.hasMoreElements();){
       
     sf.add((String)e.nextElement());}
 Collections.reverse(sf);
 
 return sf;
 }
 
 
 ArrayList<Integer> nothing(){
 
     ArrayList<Integer> sf = new ArrayList<Integer>();
       try {
           numbers.load(new FileInputStream("numbers.propertes"));
       } catch (IOException ex) {
System.out.println("this exception caught");
       }
 for (Enumeration<Object> e = numbers.elements(); e.hasMoreElements();){
      
     sf.add(Integer.parseInt((String)e.nextElement()));
 }
 Collections.reverse(sf);
 
 return sf;
 }
 
 
}
