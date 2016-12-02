	import java.awt.FlowLayout;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	
	public class num2 extends JFrame{
		
		JPanel p;
		
		public num2(){
			setSize(300,300);
			setTitle("My Frame");
			p=new JPanel();
			p.setLayout(new FlowLayout());
			for(int i=0;i<10;i++){
				p.add(new JButton("Button"+i));
				
			}
			add(p);
			setVisible(true);
		}
		
	}
