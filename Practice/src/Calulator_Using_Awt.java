import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calulator_Using_Awt extends Frame{

	Button div = new Button(" / ");
	Button mult = new Button(" X ");
	Button sub = new Button(" - ");
	Button add = new Button(" + ");
	Button equalsto = new Button(" = ");
	Button zero = new Button(" 0 ");
	Button one = new Button(" 1 ");
	Button two = new Button(" 2 ");
	Button three = new Button(" 3 ");
	Button four = new Button(" 4 ");
	Button five = new Button(" 5 ");
	Button six = new Button(" 6 ");
	Button seven = new Button(" 7 ");
	Button eight = new Button(" 8 ");
	Button nine = new Button(" 9 ");
	Button clear = new Button(" CE ");
	Button backspace = new Button(" C ");

	TextField display = new TextField();

	Font f1 = new Font("Arial",Font.BOLD,20);
	
	Color newbeautifulcolor1 = new Color(247, 210, 210);
	Color newbeautifulcolor2 = new Color(192,192,192);
	Color specialcolor = new Color(87, 87, 87);

	int num1, num2, check, answer;

	public Calulator_Using_Awt() 
	{
		setSize(500,482);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setTitle("calculator which is capable of conquering the world");
		setLocation(500, 140);
		setBackground(newbeautifulcolor2);

		display.setBounds(10,32,10,20);
		display.setSize(480, 125);
		display.setFont(f1);
		display.setBackground(newbeautifulcolor1);
		display.setEditable(false);

		one.setBounds(10,160,100,105);
		one.setBackground(Color.black);
		one.setForeground(Color.WHITE);
		one.addActionListener(onelistener);

		two.setBounds(112,160,100,105);
		two.setBackground(Color.black);
		two.setForeground(Color.WHITE);
		two.addActionListener(twolistener);

		three.setBounds(214,160,100,105);
		three.setBackground(Color.black);
		three.setForeground(Color.WHITE);
		three.addActionListener(threelistener);

		four.setBounds(10,265,100,105);
		four.setBackground(Color.black);
		four.setForeground(Color.WHITE);
		four.addActionListener(fourlistener);

		five.setBounds(112,265,100,105);
		five.setBackground(Color.black);
		five.setForeground(Color.WHITE);
		five.addActionListener(fivelistener);

		six.setBounds(214,265,100,105);
		six.setBackground(Color.black);
		six.setForeground(Color.WHITE);
		six.addActionListener(sixlistener);

		seven.setBounds(10,370,100,105);
		seven.setBackground(Color.black);
		seven.setForeground(Color.WHITE);
		seven.addActionListener(sevenlistener);

		eight.setBounds(112,370,100,105);
		eight.setBackground(Color.black);
		eight.setForeground(Color.WHITE);
		eight.addActionListener(eightlistener);

		nine.setBounds(214,370,100,105);
		nine.setBackground(Color.black);
		nine.setForeground(Color.WHITE);
		nine.addActionListener(ninelistener);

		zero.setBounds(313,369,90,105);
		zero.setBackground(Color.black);
		zero.setForeground(Color.WHITE);
		zero.addActionListener(zerolistener);

		equalsto.setBounds(403,369,89,105);
		equalsto.setBackground(specialcolor);
		equalsto.setForeground(Color.black);
		equalsto.addActionListener(equalstolistener);

		add.setBounds(313,290,90,80);
		add.setBackground(specialcolor);
		add.setForeground(Color.black);
		add.addActionListener(addlistener);

		sub.setBounds(403,290,89,80);
		sub.setBackground(specialcolor);
		sub.setForeground(Color.black);
		sub.addActionListener(sublistener);

		mult.setBounds(313,210,90,80);
		mult.setBackground(specialcolor);
		mult.setForeground(Color.black);
		mult.addActionListener(multlistener);

		div.setBounds(403,210,89,80);
		div.setBackground(specialcolor);
		div.setForeground(Color.black);
		div.addActionListener(divlistener);

		clear.setBounds(313,160,90,50);
		clear.setBackground(specialcolor);
		clear.setForeground(Color.black);
		clear.addActionListener(clearlistener);

		backspace.setBounds(403,160,89 ,50);
		backspace.setBackground(specialcolor);
		backspace .setForeground(Color.black);
		backspace.addActionListener(backspacelistener);

		add(display);
		add(zero);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(add);
		add(sub);
		add(mult);
		add(div);
		add(equalsto);
		add(clear);
		add(backspace);

		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent E)
			{
				dispose();
			}
		});

	}

	String text,addtext;

	ActionListener onelistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "1";
			display.setText(text);
		}
	};
	ActionListener twolistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "2";
			display.setText(text);	
		}
	};
	ActionListener threelistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "3";
			display.setText(text);
		}
	};
	ActionListener fourlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "4";
			display.setText(text);
		}
	};
	ActionListener fivelistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "5";
			display.setText(text);
		}
	};
	ActionListener sixlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "6";
			display.setText(text);
		}
	};
	ActionListener sevenlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "7";
			display.setText(text);
		}
	};
	ActionListener eightlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "8";
			display.setText(text);
		}
	};
	ActionListener ninelistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			addtext = display.getText();
			text = addtext + "9";
			display.setText(text);
		}
	};
	ActionListener zerolistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			text = addtext + "0";
			display.setText(text);
		}
	};
	ActionListener clearlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			check = 0;
			num1 = 0;
			num2 = 0;
			answer = 0;
			display.setText("");
		}
	};
	ActionListener backspacelistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			addtext = display.getText();
			int num;
			num = addtext.length() - 1;
			display.setText(text.substring(0,num));
		}
	};

	//************************************************arithmetic listeners *************************************
	ActionListener addlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				num1 = Integer.parseInt(display.getText());
				display.setText("");
			}
			catch (Exception exp) 
			{
				display.setText("Click CE and try again");
			}
			check = 1;
		}
	};
	ActionListener sublistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				num1 = Integer.parseInt(display.getText());
				display.setText("");
			}
			catch (Exception exp) 
			{
				display.setText("Click CE and try again");
			}
			check = 2;
		}
	};
	ActionListener multlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				num1 = Integer.parseInt(display.getText());
				display.setText("");
			}
			catch (Exception exp) 
			{
				display.setText("Click CE and try again");
			}
			check = 3;
		}
	};
	ActionListener divlistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try
			{
				num1 = Integer.parseInt(display.getText());
				display.setText("");
			}
			catch (Exception exp) 
			{
				display.setText("Click CE and try again");
			}
			check = 4;
		}
	};
	ActionListener equalstolistener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try 
			{
				num2 = Integer.parseInt(display.getText());
			}
			catch (Exception exp) 
			{
				display.setText("click ce and try again");
			}
			if(check==1)
			{
				answer = num1 + num2;
			}
			if(check==2)
			{
				answer = num1 - num2;
			}
			if(check==3)
			{
				answer = num1 * num2;
			}
			if(check==4)
			{
				answer = num1 / num2;
			}
			display.setText(String.valueOf(answer));
		}
	};
	
	public static void main(String[] args) 
	{
		new Calulator_Using_Awt();
	}
}