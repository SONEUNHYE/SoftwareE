import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class startUi extends JFrame implements ItemListener, ActionListener  {
    
   Font f1;
   
   //시작화면 새내기인지 기존사용자인지 선택받아 해당되는 사용자에 따른 UI호출
   
   private JPanel contentPane;
   private JRadioButton radioButton;
   private JRadioButton radioButton2;
   private ButtonGroup rbGroup;
   private String delngSe="0";
   private JButton startButton;

  
   
   /**
    * Launch the application.
    */
   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	startUi frame = new startUi();
               frame.setVisible(true);
               
               
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   BufferedImage img =null;
private startUi existUserUi;
//   try
private startUi newUserUi;

private Graphics g;

   /**
    * Create the frame.
    */


   public startUi() {
     setTitle("whY yoU MAKE");

 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 760, 350);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      rbGroup = new ButtonGroup();
      
      radioButton = new JRadioButton("기존사용자");
      radioButton.setBounds(200, 160, 90, 30);
      contentPane.add(radioButton);
      radioButton.addItemListener(this);
      rbGroup.add(radioButton);
      
      radioButton2 = new JRadioButton("새내기");
      radioButton2.setBounds(450, 160, 70, 30);
      contentPane.add(radioButton2);
      radioButton2.addItemListener(this);
      rbGroup.add(radioButton2);
      
      startButton = new JButton("Start");
      startButton.setBounds(180, 236, 400, 50);
      contentPane.add(startButton);
      
      ImageIcon image = new ImageIcon("C:\\Users\\user\\workspace\\21311823\\src\\Test.png");
      
      JLabel label = new JLabel("", image, JLabel.CENTER);
      label.setBounds(0, 0, image.getIconWidth(), image.getIconHeight());
      label.setIcon(image);

      JPanel panel = new JPanel(new BorderLayout());
      panel.setBounds(60, 12, image.getIconWidth(), image.getIconHeight());
      panel.setLayout(null);
      panel.add(label);
      contentPane.add(panel);
      
      startButton.addActionListener(this);
      
   }
   

 
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if ( e.getSource() == startButton ){
         if(delngSe.equals("1")){
            existUserUi.main(null);
            this.dispose();
         }
         else if(delngSe.equals("2")){
            newUserUi.main(null);
            this.dispose();
         }
         else{
            JOptionPane.showMessageDialog(null, "선택해주세요.");
         }
      }
   }
   
   public void itemStateChanged(ItemEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource() == radioButton)
      {
         if( e.getStateChange() == ItemEvent.SELECTED )
         {
            delngSe = "1";
            System.out.println(delngSe);
         }
      }
      else if(e.getSource() == radioButton2)
      {
         if( e.getStateChange() == ItemEvent.SELECTED )
         {
            delngSe = "2";
            System.out.println(delngSe);
         }
      }
      
   }
}