import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 524, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(200, 11, 112, 22);
		frame.getContentPane().add(lblNewLabel);
		
		Choice g1 = new Choice();
		g1.setFont(new Font("Dialog", Font.PLAIN, 13));
		g1.setBounds(50, 80, 70, 18);
		frame.getContentPane().add(g1);
		
		g1.add("S");
		for(int i=65;i<70;i++)
			g1.add(String.valueOf((char)i));
		g1.add("PP");
				
		Choice c1 = new Choice();
		c1.setFont(new Font("Dialog", Font.PLAIN, 13));
		c1.setBounds(50, 120, 70, 18);
		frame.getContentPane().add(c1);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c1.add(String.valueOf(i));
		
		JLabel lblNewLabel_1 = new JLabel("1)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 75, 36, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 198, 36, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		Choice g2 = new Choice();
		g2.setFont(new Font("Dialog", Font.PLAIN, 13));
		g2.setBounds(50, 200, 70, 18);
		frame.getContentPane().add(g2);
		
		g2.add("S");
		for(int i=65;i<70;i++)
			g2.add(String.valueOf((char)i));
		g2.add("PP");
		
		Choice c2 = new Choice();
		c2.setFont(new Font("Dialog", Font.PLAIN, 13));
		c2.setBounds(50, 240, 70, 18);
		frame.getContentPane().add(c2);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c2.add(String.valueOf(i));
		
		JLabel lblNewLabel_3 = new JLabel("3)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 313, 49, 35);
		frame.getContentPane().add(lblNewLabel_3);
		
		Choice g3 = new Choice();
		g3.setFont(new Font("Dialog", Font.PLAIN, 13));
		g3.setBounds(50, 320, 70, 18);
		frame.getContentPane().add(g3);
		
		g3.add("S");
		for(int i=65;i<70;i++)
			g3.add(String.valueOf((char)i));
		g3.add("PP");
		
		Choice c3 = new Choice();
		c3.setFont(new Font("Dialog", Font.PLAIN, 13));
		c3.setBounds(50, 360, 70, 18);
		frame.getContentPane().add(c3);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c3.add(String.valueOf(i));
		
		JLabel lblNewLabel_4 = new JLabel("4)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(190, 69, 49, 47);
		frame.getContentPane().add(lblNewLabel_4);
		
		Choice g4 = new Choice();
		g4.setFont(new Font("Dialog", Font.PLAIN, 13));
		g4.setBounds(230, 80, 70, 18);
		frame.getContentPane().add(g4);
		
		g4.add("S");
		for(int i=65;i<70;i++)
			g4.add(String.valueOf((char)i));
		g4.add("PP");
		
		Choice c4 = new Choice();
		c4.setFont(new Font("Dialog", Font.PLAIN, 13));
		c4.setBounds(230, 120, 70, 18);
		frame.getContentPane().add(c4);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c4.add(String.valueOf(i));
		
		JLabel lblNewLabel_5 = new JLabel("5)");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(190, 204, 49, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		Choice g5 = new Choice();
		g5.setFont(new Font("Dialog", Font.PLAIN, 13));
		g5.setBounds(230, 200, 70, 18);
		frame.getContentPane().add(g5);
		
		g5.add("S");
		for(int i=65;i<70;i++)
			g5.add(String.valueOf((char)i));
		g5.add("PP");
		
		Choice c5 = new Choice();
		c5.setFont(new Font("Dialog", Font.PLAIN, 13));
		c5.setBounds(230, 240, 70, 18);
		frame.getContentPane().add(c5);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c5.add(String.valueOf(i));
		
		JLabel lblNewLabel_6 = new JLabel("6)");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(190, 319, 49, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		Choice g6 = new Choice();
		g6.setFont(new Font("Dialog", Font.PLAIN, 13));
		g6.setBounds(230, 320, 70, 18);
		frame.getContentPane().add(g6);
		
		g6.add("S");
		for(int i=65;i<70;i++)
			g6.add(String.valueOf((char)i));
		g6.add("PP");
		
		Choice c6 = new Choice();
		c6.setFont(new Font("Dialog", Font.PLAIN, 13));
		c6.setBounds(230, 360, 70, 18);
		frame.getContentPane().add(c6);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c6.add(String.valueOf(i));
		
		JLabel lblNewLabel_7 = new JLabel("7)");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(370, 75, 49, 29);
		frame.getContentPane().add(lblNewLabel_7);
		
		Choice g7 = new Choice();
		g7.setFont(new Font("Dialog", Font.PLAIN, 13));
		g7.setBounds(410, 80, 70, 18);
		frame.getContentPane().add(g7);
		
		g7.add("S");
		for(int i=65;i<70;i++)
			g7.add(String.valueOf((char)i));
		g7.add("PP");
		
		Choice c7 = new Choice();
		c7.setFont(new Font("Dialog", Font.PLAIN, 13));
		c7.setBounds(410, 120, 70, 18);
		frame.getContentPane().add(c7);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c7.add(String.valueOf(i));
		
		JLabel lblNewLabel_8 = new JLabel("8)");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(370, 204, 49, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		Choice g8 = new Choice();
		g8.setFont(new Font("Dialog", Font.PLAIN, 13));
		g8.setBounds(410, 200, 70, 18);
		frame.getContentPane().add(g8);
		
		g8.add("S");
		for(int i=65;i<70;i++)
			g8.add(String.valueOf((char)i));
		g8.add("PP");
		
		Choice c8 = new Choice();
		c8.setFont(new Font("Dialog", Font.PLAIN, 13));
		c8.setBounds(410, 240, 70, 18);
		frame.getContentPane().add(c8);
		
		for(float i=0.0f;i<=4.0f;i = i+0.5f)
			c8.add(String.valueOf(i));
		
		JButton cal = new JButton("Find");
		cal.setForeground(new Color(255, 255, 255));
		cal.setBackground(new Color(64, 0, 64));
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Float> c = new ArrayList<>();
				ArrayList<String> g = new ArrayList<>();
				
				g.add(g1.getSelectedItem());
				g.add(g2.getSelectedItem());
				g.add(g3.getSelectedItem());
				g.add(g4.getSelectedItem());
				g.add(g5.getSelectedItem());
				g.add(g6.getSelectedItem());
				g.add(g7.getSelectedItem());
				g.add(g8.getSelectedItem());
				
				c.add(Float.parseFloat(c1.getSelectedItem()));
				c.add(Float.parseFloat(c2.getSelectedItem()));
				c.add(Float.parseFloat(c3.getSelectedItem()));
				c.add(Float.parseFloat(c4.getSelectedItem()));
				c.add(Float.parseFloat(c5.getSelectedItem()));
				c.add(Float.parseFloat(c6.getSelectedItem()));
				c.add(Float.parseFloat(c7.getSelectedItem()));
				c.add(Float.parseFloat(c8.getSelectedItem()));
				
				float sum = 0.0f,num=0.0f,n=0.0f;
				
				for(int i=0;i<c.size();i++)
					sum = sum + c.get(i);
				
				for(int i=0;i<g.size();i++)
				{
					switch(g.get(i)) {
					case "S" : n=10.0f; break;
					case "A" : n=9.0f; break;
					case "B" : n=8.0f; break;
					case "C" : n=7.0f; break;
					case "D" : n=6.0f; break;
					case "E" : n=5.0f; break;
					case "PP" : n=0.0f; break;
					}
					
					num = num + (n*c.get(i));
				}
				
				n = num/sum;
				
				txt.setText(String.valueOf(n));
			}
		});
		cal.setFont(new Font("Tahoma", Font.BOLD, 15));
		cal.setBounds(126, 427, 92, 35);
		frame.getContentPane().add(cal);
		
		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.BOLD, 13));
		txt.setBounds(240, 428, 97, 34);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
	}
}
