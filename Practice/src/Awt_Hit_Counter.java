import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt_Hit_Counter extends Frame implements ActionListener{
	TextField tf = new TextField();	
	Button count = new Button("Count");	
	Label tl = new Label();
	String number = "0";
	Awt_Hit_Counter() {
		setSize(350,250);
		setLayout(null);
		setVisible(true);
		
		tl.setText("Counter : ");
		tl.setBounds(85,39,50,50);
		tl.setForeground(Color.GREEN);
		
		tf.setText(number);
		tf.setBounds(140,50,85,30);
		tf.setBackground(Color.cyan);
		
		tf.setEditable(false);
		
		count.setBounds(235,48,65,30);
		count.addActionListener(this);
		
		add(tl);
		add(tf);
		add(count);
		
		
		addWindowListener(new WindowAdapter() 
		{
				public void windowClosing(WindowEvent E)
				{
					dispose();
				}
		});
	}
	
public static void main(String[] args) 
{
			new Awt_Hit_Counter();
}

@Override
public void actionPerformed(ActionEvent e) {
	try 
	{
		int num = Integer.valueOf(number);
		num++;
		number = String.valueOf(num);
		tf.setText(number);
	}
	catch (Exception exp) {
		Label tryagain = new Label();
		tryagain.setText("try again bruh");
		tryagain.setBounds(300,125,50,50);
	}
	
}
}
