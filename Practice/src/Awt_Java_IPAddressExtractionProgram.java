import java.awt.*;
import java.awt.event.*;

public class Awt_Java_IPAddressExtractionProgram extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;

	TextField tf;
	Button b1;
	Label l = new Label();
	Awt_Java_IPAddressExtractionProgram() {
		tf = new TextField();
		tf.setBounds(30, 30, 150, 30);

		b1 = new Button("Get the ip address");
		b1.setBounds(28, 70, 150, 50);

		l.setBounds(28, 120, 500, 50);
		b1.addActionListener(this);

		add(tf);
		add(b1);
		add(l);
		setSize(600, 600);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			String host = tf.getText();
			String ip = java.net.InetAddress.getByName(host).getHostAddress();
			l.setText("IP of " + host + " is : " + ip);
		} catch (Exception exp) {
			System.out.println(exp);
		}

	}

	public static void main(String[] args) {
		new Awt_Java_IPAddressExtractionProgram();
	}

}
