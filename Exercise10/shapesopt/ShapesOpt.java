/*2. Develop a program that has a Choice component which contains
the names of shapes such as rectangle, triangle, square and circle.
Draw the corresponding shapes for given parameters as per user’s
choice.*/

import java.awt.*;
import java.awt.event.*;

class ShapesOpt extends Frame implements ItemListener {
	Choice s;
	String msg = "";

	public ShapesOpt() {

		// Use a flow layout.
		setLayout(new FlowLayout());
		// Create choice lists.
		s = new Choice();


		// Add items to Shapes list.
		s.add("1.Circle");
		s.add("2.Triangle");
		s.add("3.Rectangle");
		s.add("4.Square");



		// Add choice lists to window.
		add(s);


		// Add item listeners.
		s.addItemListener(this);


		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}

	// Display current selections.
	public void paint(Graphics g) {

		String ch=s.getSelectedItem();
		if(ch=="1.Circle")
		{	g.setColor(Color.red);
			g.fillOval(20, 200, 100, 100); //fill circle with color
		}

		else if(ch=="2.Triangle")
		{ 
			g.setColor(Color.red);		//trangle with color						
			g.drawLine(20, 130, 280, 130);
        		g.drawLine(20, 130, 200, 65);
        		g.drawLine(200, 65, 280, 130);
		}

		else if(ch=="3.Rectangle")
		{	
			g.setColor(Color.red);
			g.fillRect(20, 160, 30, 80); //filled rectangle with color
		}

		else
		{   
			g.setColor(Color.red);
			g.fillRect(20, 160, 70, 70); //filled square with color
		}

		
	}
	public static void main(String[] args) {
		ShapesOpt appwin = new ShapesOpt();

		appwin.setSize(new Dimension(500, 500));
		appwin.setTitle("SHAPES");
		appwin.setVisible(true);
	}
}