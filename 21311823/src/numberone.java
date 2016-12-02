import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class numberone {

   private JFrame frame;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
            	numberone window = new numberone();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public numberone() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame("MyFrame");
      frame.setBounds(100, 100, 629, 215);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      frame.getContentPane().setBackground(Color.BLUE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.CYAN);
      panel.setBounds(85, 27, 454, 33);
      frame.getContentPane().add(panel);
      
      JLabel label = new JLabel("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4. \uD53C\uC790\uC758 \uC885\uB958\uB97C \uC120\uD0DD\uD558\uC138\uC694");
      label.setFont(new Font("±¼¸²", Font.BOLD, 15));
      panel.add(label);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.GREEN);
      panel_1.setBounds(106, 74, 411, 55);
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JButton btnNewButton = new JButton("\uCF64\uBCF4 \uD53C\uC790");
      btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 15));
      btnNewButton.setBackground(Color.WHITE);
      btnNewButton.setBounds(14, 12, 105, 27);
      panel_1.add(btnNewButton);
      
      JButton btnNewButton_1 = new JButton("\uBD88\uACE0\uAE30 \uD53C\uC790");
      btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 15));
      btnNewButton_1.setBackground(Color.WHITE);
      btnNewButton_1.setBounds(274, 12, 123, 27);
      panel_1.add(btnNewButton_1);
      
      JButton btnNewButton_2 = new JButton("\uD3EC\uD14C\uC774\uD1A0 \uD53C\uC790");
      btnNewButton_2.setFont(new Font("±¼¸²", Font.BOLD, 15));
      btnNewButton_2.setBackground(Color.WHITE);
      btnNewButton_2.setBounds(133, 12, 129, 27);
      panel_1.add(btnNewButton_2);
   }

}