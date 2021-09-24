/*
3. Program to find maximum of three numbers using AWT.
*/


import java.awt.*;
import java.awt.event.*;

public class Maximum extends Frame
implements ActionListener {

	TextField first,second,third;

	public Maximum() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		// Create controls.
		Label firstn = new Label("first number: ",Label.RIGHT);
		Label secondn = new Label("second number: ",Label.RIGHT);
		Label thirdn = new Label("third number: ",Label.RIGHT);


		first = new TextField(10);
		second = new TextField(10);
		third = new TextField(10);
		

		// Add the controls to the frame.
		add(firstn);
		add(first);
		add(secondn);
		add(second);
		add(thirdn);
		add(third);

		// Add action event handlers.
		first.addActionListener(this);
		second.addActionListener(this);
		third.addActionListener(this);

		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
		System.exit(0);
		}
		});
	}

	// User pressed Enter.
	public void actionPerformed(ActionEvent ae) {
		repaint();
	}



	public void paint(Graphics g) {
		g.drawString("first:" + first.getText(),20, 120);		//print 3 nos
		g.drawString("second: " +second.getText(), 20, 140);
		g.drawString("third: " +third.getText(), 20, 160);
		
            	String a = first.getText();
		String b = second.getText();
		String c = third.getText();


		

		
           	

		//comapre 3 numbers and prind maximum no
		if(a.compareTo(b)>=0 && b.compareTo(c)>=0)
		{
			g.drawString("maximum no is:"+a,20,200);
		}
		else if(a.compareTo(c)>=0 && c.compareTo(b)>=0)
		{
			g.drawString("maximum no is:"+a,20,200);
		}
		else if(b.compareTo(a)>=0 && a.compareTo(c)>=0)
		{
			g.drawString("maximum no is:"+b,20,200);
		}
		else if(b.compareTo(c)>=0 && c.compareTo(a)>=0)
		{
			g.drawString("maximum no is:"+b,20,200);
		}
		else if(c.compareTo(a)>=0 && a.compareTo(b)>=0)
		{
			g.drawString("maximum no is:"+c,20,200);
		}
		else if(c.compareTo(b)>=0 && b.compareTo(a)>=0)
		{
			g.drawString("maximum no is:"+c,20,200);
		}
}		



public static void main(String[] args) {
	Maximum appwin = new Maximum();
	appwin.setSize(new Dimension(700,700));
	appwin.setTitle("Maximum of 3 number");
	appwin.setVisible(true);
}
}

Verified
