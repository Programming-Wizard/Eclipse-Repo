import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Basic_Paint_App extends Frame implements MouseMotionListener,MouseListener  {

	private static final long serialVersionUID = 1L;

	Basic_Paint_App()
	{
		addMouseMotionListener(this);
		addMouseListener(this);

		setSize(1000,800);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setBackground(Color.black);
		setTitle("Application which cann basically paint and erase;)");
		
		Button clear = new Button("erase all");
		clear.setBounds(880,35,100,50);
		clear.setForeground(Color.black);
		clear.setBackground(Color.gray);
		clear.addActionListener(clearlistener);
		add(clear);
		

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent WE)
			{
				dispose();
			}
		});
		

	}
	ActionListener clearlistener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Graphics g = getGraphics();
			g.setColor(Color.black);
			g.fillRect(0, 0, 1000, 800);
		}
	};

	public static void main(String[] args) {
		new Basic_Paint_App();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.yellow);
		g.fillOval(e.getX(), e.getY(), 15, 10); 
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		g.setColor(Color.yellow);
		g.fillOval(e.getX(), e.getY(), 20, 10); 
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		

	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}


}
