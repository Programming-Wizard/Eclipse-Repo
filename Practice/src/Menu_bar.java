import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.util.List;

public class Menu_bar extends Frame{

	private static final long serialVersionUID = 1L;
	Font myfont = new Font("Arial", 10, 15);
	Menu_bar()
	{
		setSize(650,550);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setBackground(Color.gray);

		//		List l1 = new List(5);


		//		panel
		Panel panel1 = new Panel();
		panel1.setBounds(10, 425, 200, 110);
		panel1.setBackground(Color.yellow);
		Button b1 = new Button("button 1");
		Button b2 = new Button("button 2");
		Button b3 = new Button("button 3");
		Button b4 = new Button("button 4");
		Button b5 = new Button("button 5");
		Button b6 = new Button("button 6");
		Button b7 = new Button("button 7");
		Button b8 = new Button("button 8");
		Button b9 = new Button("button 9");
		Button b0 = new Button("button 0");
		b0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit.getDefaultToolkit().beep();
			}
		});
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		panel1.add(b5);
		panel1.add(b6);
		panel1.add(b7);
		panel1.add(b8);
		panel1.add(b9);
		panel1.add(b0);

		//		textfield
		TextField tf1 = new TextField();
		Label text1 = new Label("text 1 : ");
		tf1.setBounds(49, 60, 100, 20);
		text1.setBounds(10, 60, 35, 20);

		//		textarea
		Label text2 = new Label("text 2 : ");
		TextArea ta1 = new TextArea();
		text2.setBounds(10, 100, 35, 20);
		ta1.setBounds(49,100,100,50);

		//		checkboxes
		Label text3 = new Label("options : ");
		text3.setBounds(10, 180, 50, 20);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("option 1",cbg,false); 
		Checkbox c2 = new Checkbox("option 2",cbg,false);
		c1.setBounds(10,200,60,35);
		c2.setBounds(10,210,60,60);

		//		choices
		Choice c = new Choice();
		c.setBounds(10,270,100,100);
		c.add("choice 1");
		c.add("choice 2");
		c.add("choice 3");
		c.add("choice 4");
		c.add("choice 5");

		//		scrollbar
		Scrollbar sb = new Scrollbar();
		sb.setBounds(10, 300, 50, 89);

		//		menubar
		MenuBar mb = new MenuBar();
		mb.setFont(myfont);
		Menu m = new Menu("Menu");
		Menu subm = new Menu("Sub-Menu");
		MenuItem i1 = new MenuItem("option 1");
		MenuItem si1 = new MenuItem("option 1");
		MenuItem i2 = new MenuItem("option 2");
		MenuItem si2 = new MenuItem("option 2");
		MenuItem i3 = new MenuItem("option 3");
		MenuItem si3 = new MenuItem("option 3");
		mb.add(m);
		m.add(i1);
		m.add(i2);
		m.add(i3);
		m.add(subm);
		subm.add(si1);
		subm.add(si2);
		subm.add(si3);


		//		adding components
		add(text1);
		add(tf1);
		add(ta1);
		add(text2);
		add(text3);
		add(c1);
		add(c2);
		add(c);
		add(sb);
		setMenuBar(mb);
		add(panel1);

		//		window closing
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent WE) 
			{
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		new Menu_bar();
	}

}
