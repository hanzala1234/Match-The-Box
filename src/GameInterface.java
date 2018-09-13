
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import java.io.*;
import java.lang.reflect.Field;
import javax.sound.sampled.AudioSystem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ok
 */

public class GameInterface extends javax.swing.JFrame {
boolean something;
boolean start =true;
    InputStream in ;
     AudioStream au;
     int limit;
     
     public void repaint(){
     this.repaint();
  }
     @Override
     public void setVisible(boolean tu){
       super.setVisible(tu);
      if(tu){
       start = true;
      }
     }
     
    class timings extends SwingWorker<Void,Void>{
GameInterface se ;

    
        @Override
        protected Void doInBackground() throws Exception {
     int seconds=0;
     int second = 0;
     int minutes = 0;
     while (true){
         if(start){
         Thread.sleep(1000);
       
        seconds+=1;
         second+=1;
         if(second==60){
         minutes+=1;
         second=0;
         }}
         if(minutes==limit-1
                 ){
         if(second%2==0){
             TimeCalculation.setForeground(Color.red);
         }
         else{
              TimeCalculation.setForeground(Color.WHITE);
         }
         }
         
       TimeCalculation.setText("00"+":"+minutes+":"+second);
     if(minutes==limit||container.size()==0){
         if(container.size()==0){
         added(seconds,jLabel5.getText());
          OverBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GameWon.png"))); // NOI18N
         }else{
         OverBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOver.png"))); 
         }
    OverBackground.setVisible(true);
    jLayeredPane1.setVisible(true);
    something=false;
     //    repaint();
      
     
         
         break;
     }
     
     
     }
     
    
          return null; 
            
    
     }


}
    void added(int sec, String mei){
    se.addin(sec, mei);
    } 
   
    /**
     * Creates new form GameInterface
     */
    void visiblityfalse(JLabel... jla){
   for (int i =0;i<jla.length;i++){
   jla[i].setVisible(false);
 
   }
    
    }
    ArrayList<JLabel> container;
  LinkedList<JLabel> openrecord;
    void contadd(JLabel... jl){
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
this.setResizable(false);
        container = new ArrayList<JLabel>();
        for(int i =0;i<jl.length;i++){
        container.add(jl[i]);
        } 
    
    }timings s; 
     
    public GameInterface() {
       

       something=true;
String so=Menu.getPLayerName();
limit = Menu.getMinutes();
         openrecord = new LinkedList<JLabel>();
      setLocationRelativeTo(null);
        initComponents();
   JLabel[] sd = {pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10,pic11,pic12,pic13,pic14,pic15,pic16,pic17,pic18,pic19,pic20,pic21,pic22,pic23,pic24}  ;
contadd(sd);
visiblityfalse(sd);
jLayeredPane1.setVisible(false);

Randompic();
s= new timings();
s.execute();
jLabel5.setText(so);
 
      
   
    }
    void FunnyMessage(String path){
        String picno = path.substring(path.lastIndexOf('/')+1, path.lastIndexOf('.'));
String title=null;
switch(picno){
    case "pic5":
        title = "pak"
;break;    case "pic8":
       title = "tabdeel";
    break;
        case "pic6":
      title = "Go Nawaz GO";
        break;   
        case "pic9":
            title ="Rashkay";
            break;
            case "pic10":
            title ="Gormint";
            break;

}    
        try {
            in  = new FileInputStream(new File("E:\\NetBeansProjects\\M.H Game\\src\\sounds\\"+title+".wav"));
  au = new AudioStream(in);

  
        AudioPlayer.player.start(au);
 
       
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(GameInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
         //   Logger.getLogger(GameInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
//labelappear(title);
    
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Restart1 = new javax.swing.JLabel();
        Restart = new javax.swing.JLabel();
        OverBackground = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        Box3 = new javax.swing.JLabel();
        pic13 = new javax.swing.JLabel();
        pic24 = new javax.swing.JLabel();
        pic19 = new javax.swing.JLabel();
        pic15 = new javax.swing.JLabel();
        Box15 = new javax.swing.JLabel();
        pic16 = new javax.swing.JLabel();
        pic14 = new javax.swing.JLabel();
        pic21 = new javax.swing.JLabel();
        pic17 = new javax.swing.JLabel();
        Box13 = new javax.swing.JLabel();
        pic10 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        Box14 = new javax.swing.JLabel();
        Box24 = new javax.swing.JLabel();
        pic7 = new javax.swing.JLabel();
        Box4 = new javax.swing.JLabel();
        Box10 = new javax.swing.JLabel();
        pic23 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        pic9 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        pic12 = new javax.swing.JLabel();
        pic11 = new javax.swing.JLabel();
        Box12 = new javax.swing.JLabel();
        Box21 = new javax.swing.JLabel();
        Box17 = new javax.swing.JLabel();
        pic20 = new javax.swing.JLabel();
        Box20 = new javax.swing.JLabel();
        pic18 = new javax.swing.JLabel();
        Box18 = new javax.swing.JLabel();
        Box9 = new javax.swing.JLabel();
        pic6 = new javax.swing.JLabel();
        Box6 = new javax.swing.JLabel();
        Box11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Box5 = new javax.swing.JLabel();
        Box23 = new javax.swing.JLabel();
        pic8 = new javax.swing.JLabel();
        Box8 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        Box2 = new javax.swing.JLabel();
        Box7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Box1 = new javax.swing.JLabel();
        Box16 = new javax.swing.JLabel();
        pic22 = new javax.swing.JLabel();
        Box22 = new javax.swing.JLabel();
        TimeCalculation = new javax.swing.JLabel();
        Box19 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Match The Box");
        setIconImage((new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))).getImage());
        setResizable(false);
        setSize(new java.awt.Dimension(445, 335));

        Restart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EXIT.png"))); // NOI18N
        Restart1.setText("jLabel5");
        Restart1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Restart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Restart1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(Restart1);
        Restart1.setBounds(80, 360, 180, 45);

        Restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Restart.png"))); // NOI18N
        Restart.setText("jLabel5");
        Restart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Restart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestartMouseClicked(evt);
            }
        });
        jLayeredPane1.add(Restart);
        Restart.setBounds(80, 280, 180, 45);

        OverBackground.setFont(new java.awt.Font("Tekton Pro Ext", 0, 36)); // NOI18N
        OverBackground.setForeground(new java.awt.Color(255, 0, 0));
        OverBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OverBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOver.png"))); // NOI18N
        OverBackground.setIconTextGap(0);
        OverBackground.setPreferredSize(new java.awt.Dimension(38, 530));
        jLayeredPane1.add(OverBackground);
        OverBackground.setBounds(-30, 0, 440, 530);

        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arrow.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("User");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Time Elapsed:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 110, 30));

        pic3.setText("pic3");
        pic3.setIconTextGap(30);
        jPanel1.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 60, 53));

        Box3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box3.setToolTipText("pic1");
        Box3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box3MouseClicked(evt);
            }
        });
        jPanel1.add(Box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 60, 53));

        pic13.setText("pic13");
        pic13.setIconTextGap(30);
        jPanel1.add(pic13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 60, 53));

        pic24.setText("pic24");
        pic24.setIconTextGap(20);
        jPanel1.add(pic24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 60, 53));

        pic19.setText("pic19");
        pic19.setIconTextGap(30);
        jPanel1.add(pic19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 60, 53));

        pic15.setText("pic15");
        pic15.setIconTextGap(30);
        jPanel1.add(pic15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 53));

        Box15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box15MouseClicked(evt);
            }
        });
        jPanel1.add(Box15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 60, 53));

        pic16.setText("pic16");
        pic16.setIconTextGap(30);
        jPanel1.add(pic16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 60, 53));

        pic14.setText("pic14");
        pic14.setIconTextGap(30);
        jPanel1.add(pic14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 60, 53));

        pic21.setText("pic21");
        pic21.setIconTextGap(30);
        jPanel1.add(pic21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 53));

        pic17.setText("pic17");
        pic17.setIconTextGap(20);
        jPanel1.add(pic17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 60, 53));

        Box13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box13MouseClicked(evt);
            }
        });
        jPanel1.add(Box13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 60, 53));

        pic10.setText("pic10");
        pic10.setIconTextGap(30);
        jPanel1.add(pic10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 60, 53));

        pic4.setText("pic4");
        pic4.setIconTextGap(30);
        jPanel1.add(pic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, 53));

        Box14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box14MouseClicked(evt);
            }
        });
        jPanel1.add(Box14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 60, 53));

        Box24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box24MouseClicked(evt);
            }
        });
        jPanel1.add(Box24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 60, 53));

        pic7.setText("pic7");
        pic7.setIconTextGap(30);
        jPanel1.add(pic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 60, 53));

        Box4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box4MouseClicked(evt);
            }
        });
        jPanel1.add(Box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, 53));

        Box10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box10.setToolTipText("pic1");
        Box10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box10MouseClicked(evt);
            }
        });
        jPanel1.add(Box10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 60, 53));

        pic23.setText("pic23");
        pic23.setIconTextGap(20);
        jPanel1.add(pic23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 60, 53));

        pic5.setText("pic5");
        pic5.setIconTextGap(30);
        jPanel1.add(pic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 60, 53));

        pic9.setText("pic9");
        pic9.setIconTextGap(30);
        jPanel1.add(pic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 60, 53));

        pic1.setText("pic1");
        pic1.setIconTextGap(20);
        jPanel1.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, 53));

        pic12.setText("pic12");
        pic12.setIconTextGap(20);
        jPanel1.add(pic12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, 53));

        pic11.setText("pic11");
        pic11.setIconTextGap(20);
        jPanel1.add(pic11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 60, 53));

        Box12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box12MouseClicked(evt);
            }
        });
        jPanel1.add(Box12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, 53));

        Box21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box21MouseClicked(evt);
            }
        });
        jPanel1.add(Box21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 60, 53));

        Box17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box17MouseClicked(evt);
            }
        });
        jPanel1.add(Box17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 60, 53));

        pic20.setText("pic20");
        pic20.setIconTextGap(30);
        jPanel1.add(pic20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 60, 53));

        Box20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box20MouseClicked(evt);
            }
        });
        jPanel1.add(Box20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 60, 53));

        pic18.setText("pic18");
        pic18.setIconTextGap(20);
        jPanel1.add(pic18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 60, 53));

        Box18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box18MouseClicked(evt);
            }
        });
        jPanel1.add(Box18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 60, 53));

        Box9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box9MouseClicked(evt);
            }
        });
        jPanel1.add(Box9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 60, 53));

        pic6.setText("pic6");
        pic6.setIconTextGap(30);
        jPanel1.add(pic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 60, 53));

        Box6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box6MouseClicked(evt);
            }
        });
        jPanel1.add(Box6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 60, 53));

        Box11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box11MouseClicked(evt);
            }
        });
        jPanel1.add(Box11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 60, 53));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borders.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, 470));

        Box5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box5MouseClicked(evt);
            }
        });
        jPanel1.add(Box5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 60, 53));

        Box23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box23MouseClicked(evt);
            }
        });
        jPanel1.add(Box23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 60, 53));

        pic8.setText("pic8");
        pic8.setIconTextGap(30);
        jPanel1.add(pic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 60, 53));

        Box8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box8MouseClicked(evt);
            }
        });
        jPanel1.add(Box8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 60, 53));

        pic2.setText("pic2");
        pic2.setIconTextGap(20);
        jPanel1.add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, 53));

        Box2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box2MouseClicked(evt);
            }
        });
        jPanel1.add(Box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, 53));

        Box7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box7MouseClicked(evt);
            }
        });
        jPanel1.add(Box7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 53));

        jLabel4.setBackground(new java.awt.Color(0, 51, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("User name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 30));

        Box1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box1MouseClicked(evt);
            }
        });
        jPanel1.add(Box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, 53));

        Box16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box16.setToolTipText("pic1");
        Box16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box16MouseClicked(evt);
            }
        });
        jPanel1.add(Box16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 60, 53));

        pic22.setText("pic22");
        pic22.setIconTextGap(30);
        jPanel1.add(pic22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 53));

        Box22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box22.setToolTipText("pic1");
        Box22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box22MouseClicked(evt);
            }
        });
        jPanel1.add(Box22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 53));

        TimeCalculation.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        TimeCalculation.setForeground(new java.awt.Color(241, 14, 153));
        TimeCalculation.setText("00:0:0");
        jPanel1.add(TimeCalculation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 90, 30));

        Box19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squares.png"))); // NOI18N
        Box19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Box19MouseClicked(evt);
            }
        });
        jPanel1.add(Box19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 60, 53));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.png"))); // NOI18N
        background.setIconTextGap(0);
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Box1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box1MouseClicked
if(something){
    check(pic1);}
  

    }//GEN-LAST:event_Box1MouseClicked

    private void Box4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box4MouseClicked
             
        if(something){
         
             check(pic4);}
    }//GEN-LAST:event_Box4MouseClicked

    private void Box2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box2MouseClicked
          
        if(something){
             check(pic2);}
    }//GEN-LAST:event_Box2MouseClicked

    private void Box5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box5MouseClicked
              
                    if(something){
             check(pic5);}
    }//GEN-LAST:event_Box5MouseClicked

    private void Box6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box6MouseClicked
       
                      if(something){
             check(pic6);}
    }//GEN-LAST:event_Box6MouseClicked

    private void Box3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box3MouseClicked
 
                   if(something){
             check(pic3);}
    }//GEN-LAST:event_Box3MouseClicked

    private void Box7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box7MouseClicked
         if(something){
             check(pic7);}
    }//GEN-LAST:event_Box7MouseClicked

    private void Box8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box8MouseClicked
         if(something){
             check(pic8);}
    }//GEN-LAST:event_Box8MouseClicked

    private void Box9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box9MouseClicked
         if(something){
             check(pic9);}
    }//GEN-LAST:event_Box9MouseClicked

    private void Box10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box10MouseClicked
         if(something){
             check(pic10);}
    }//GEN-LAST:event_Box10MouseClicked

    private void Box11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box11MouseClicked
          
        if(something){
             check(pic11);}
    }//GEN-LAST:event_Box11MouseClicked

    private void Box12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box12MouseClicked
  
        if(something){
             check(pic12);}
    }//GEN-LAST:event_Box12MouseClicked

    private void Box13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box13MouseClicked
        if(something){
             check(pic13);}
    }//GEN-LAST:event_Box13MouseClicked

    private void Box14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box14MouseClicked
          if(something){
             check(pic14);}
    }//GEN-LAST:event_Box14MouseClicked

    private void Box15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box15MouseClicked
          if(something){
             check(pic15);}
    }//GEN-LAST:event_Box15MouseClicked

    private void Box16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box16MouseClicked
       if(something){
             check(pic16);}
    }//GEN-LAST:event_Box16MouseClicked

    private void Box17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box17MouseClicked
         if(something){
             check(pic17);}
    }//GEN-LAST:event_Box17MouseClicked

    private void Box18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box18MouseClicked
         if(something){
             check(pic18);}
    }//GEN-LAST:event_Box18MouseClicked

    private void Box19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box19MouseClicked
          if(something){
             check(pic19);}
    }//GEN-LAST:event_Box19MouseClicked

    private void Box20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box20MouseClicked
          if(something){
             check(pic20);}
    }//GEN-LAST:event_Box20MouseClicked

    private void Box21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box21MouseClicked
       if(something){
             check(pic21);}
    }//GEN-LAST:event_Box21MouseClicked

    private void Box22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box22MouseClicked
         if(something){
             check(pic22);}
    }//GEN-LAST:event_Box22MouseClicked

    private void Box23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box23MouseClicked
         if(something){
             check(pic23);}
    }//GEN-LAST:event_Box23MouseClicked

    private void Box24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Box24MouseClicked
       if(something){
             check(pic24);}
    }//GEN-LAST:event_Box24MouseClicked

    private void Restart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Restart1MouseClicked
System.exit(-1);
    }//GEN-LAST:event_Restart1MouseClicked

    private void RestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestartMouseClicked

        this.setVisible(false);
        GameInterface sdf=  new GameInterface();     
        sdf.setVisible(true);
        Menu.setframe(sdf);
                
    }//GEN-LAST:event_RestartMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
this.setVisible(false);
start = false;
se.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BackMouseClicked

    void check(JLabel som){
        AudioPlayer.player.stop(au);
        som.setVisible(!som.isVisible());
if(!som.isVisible()){
openrecord.remove(som);

}
        AudioPlayer.player.stop();
   boolean same =false;
int num = 0;
    for (int i =0;i<container.size();i++){

        JLabel jl = container.get(i);

if(jl.isVisible()){
     num+=1;
  if(!openrecord.contains(jl)){
   
      openrecord.add(jl);}

}
if(num==3){
       
        
    try{
    String st = openrecord.get(0).getIcon().toString();
  
    String nd= openrecord.get(1).getIcon().toString();
      String rd= openrecord.get(2).getIcon().toString();
   boolean first = st.equals(nd);
   same = first&&nd.equals(rd);
  
 
   if(same){
       if(Menu.getMusic()){
       FunnyMessage(nd);}
   container.removeAll(openrecord);
   for (int so = 0;so<3;so++){
   getlabel(openrecord.get(0).getText()
   ).setVisible(false);
   
       openrecord.get(0).setVisible(false);
  openrecord.removeFirst();
   }
   
   }
   else{
num=0;       

             
            




openrecord.getFirst().setVisible(false);
openrecord.removeFirst();
}}catch(IndexOutOfBoundsException e ){}}


}
        
}


JLabel getlabel(String text){
JLabel be=null;
switch(text){
    case "pic1":
        be=Box1;
        break;
    case "pic2":
        be=Box2;
        break;
        case "pic3":
        be=Box3;
        break;
        case "pic4":
        be=Box4;
        break;   
        case "pic5":
        be=Box5;
        break; 
        case "pic6":
        be=Box6;
        break; 
            case "pic7":
        be=Box7;
        break; 
case "pic8":
        be=Box8;
        break;
    case "pic9":
        be=Box9;
        break; 
         case "pic10":
        be=Box10;
        break; 
              case "pic11":
        be=Box11;
        break;
                   case "pic12":
        be=Box12;
        break; 
                       case "pic13":
        be=Box13;
        break; 
                           case "pic14":
        be=Box14;
        break; 
       case "pic15":
        be=Box15;
        break; 
   case "pic16":
        be=Box16;
        break;   
       case "pic17":
        be=Box17;
        break; 
           case "pic18":
        be=Box18;
        break; 
               case "pic19":
        be=Box19;
        break;
                    case "pic20":
        be=Box20;
        break;
                         case "pic21":
        be=Box21;break;
case "pic22":
        be=Box22
                ;break;
    case "pic23":
        be=Box23
                ;break;
        case "pic24":
        be=Box24
                ;break;
}
return be;
}
 
void Randompic(){
Random rn = new Random();
String[] som ={"5","8","10","5","10","4","8","10","4","8","3","3","3","4","5","6","6","6","7","7","7","1","1","1"};

Collections.shuffle(Arrays.asList(som));
int i =0;
for (JLabel so:container){
so.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic"+som[i]+".png"))); 
i+=1;
}

/*for(String e:som){
pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic"+"e"+".png"))); 

}*/


}
static Menu se ;
 static void som(){
se= new Menu();
se.setVisible(true);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       som();
    
       
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Box1;
    private javax.swing.JLabel Box10;
    private javax.swing.JLabel Box11;
    private javax.swing.JLabel Box12;
    private javax.swing.JLabel Box13;
    private javax.swing.JLabel Box14;
    private javax.swing.JLabel Box15;
    private javax.swing.JLabel Box16;
    private javax.swing.JLabel Box17;
    private javax.swing.JLabel Box18;
    private javax.swing.JLabel Box19;
    private javax.swing.JLabel Box2;
    private javax.swing.JLabel Box20;
    private javax.swing.JLabel Box21;
    private javax.swing.JLabel Box22;
    private javax.swing.JLabel Box23;
    private javax.swing.JLabel Box24;
    private javax.swing.JLabel Box3;
    private javax.swing.JLabel Box4;
    private javax.swing.JLabel Box5;
    private javax.swing.JLabel Box6;
    private javax.swing.JLabel Box7;
    private javax.swing.JLabel Box8;
    private javax.swing.JLabel Box9;
    private javax.swing.JLabel OverBackground;
    private javax.swing.JLabel Restart;
    private javax.swing.JLabel Restart1;
    private javax.swing.JLabel TimeCalculation;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic10;
    private javax.swing.JLabel pic11;
    private javax.swing.JLabel pic12;
    private javax.swing.JLabel pic13;
    private javax.swing.JLabel pic14;
    private javax.swing.JLabel pic15;
    private javax.swing.JLabel pic16;
    private javax.swing.JLabel pic17;
    private javax.swing.JLabel pic18;
    private javax.swing.JLabel pic19;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic20;
    private javax.swing.JLabel pic21;
    private javax.swing.JLabel pic22;
    private javax.swing.JLabel pic23;
    private javax.swing.JLabel pic24;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JLabel pic8;
    private javax.swing.JLabel pic9;
    // End of variables declaration//GEN-END:variables
}
