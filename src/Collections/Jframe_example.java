package Collections;
import javax.swing.*;

import javax.swing.JFrame;

import java.awt.*;



class Test {
	private JFrame f;
	private JPanel p;
	private JButton b;
	
	public Test()
	{
		gui();
		
	}
	public void gui() {
		f= new JFrame("Bingo game");
		f.setVisible(true);
		f.setSize(600,400);
		p= new JPanel();
		p.setBackground(Color.yellow);
		b = new JButton("RUN");
		JButton b1=new JButton("1");
		p.add(b);
		JButton b2=new JButton("2");
		p.add(b);
		JButton b3=new JButton("3");
		p.add(b);
		JButton b4=new JButton("4");
		p.add(b);
		JButton b5=new JButton("5");
		p.add(b);
		JButton b6=new JButton("6");
		p.add(b);
		JButton b7=new JButton("7");
		p.add(b);
		JButton b8=new JButton("8");
		p.add(b);
		JButton b9=new JButton("9");
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		
	   f.add(p);
				
	}
}







public class Jframe_example {

	public static void main(String[] args) {
    new Test();

	}

}
