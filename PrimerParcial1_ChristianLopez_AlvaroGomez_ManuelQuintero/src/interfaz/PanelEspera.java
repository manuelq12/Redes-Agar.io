package interfaz;

import java.awt.*;

import javax.swing.*;

public class PanelEspera extends JPanel{

	private JLabel banner;
	
	
	public static void main(String[] args) {
		JFrame x = new JFrame();
		PanelEspera n = new PanelEspera();
		x.add(n);
		x.setVisible(true);
		n.setVisible(true);
	    x.pack();
	}
	public PanelEspera() {
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);
		banner = new JLabel();
		ImageIcon bn = new ImageIcon("../docs/imgs/bannerEspera.jpg");
		banner.setIcon(bn);
		this.add(banner, BorderLayout.NORTH);
		
	}
}
