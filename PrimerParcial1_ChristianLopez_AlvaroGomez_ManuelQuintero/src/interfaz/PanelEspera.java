package interfaz;

import java.awt.*;

import javax.swing.*;

public class PanelEspera extends JPanel{

	private JLabel banner;
	private JPanel panelConectados;
	private int numConectados;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		JFrame x = new JFrame();
		PanelEspera n = new PanelEspera();
		x.add(n);
		x.setVisible(true);
		n.setVisible(true);
		n.conectarCliente("Manuel");
		x.pack();
		Thread.sleep(3000);
		n.conectarCliente("Alvaro");
		x.pack();
		Thread.sleep(3000);
		n.conectarCliente("Christian");
		x.pack();
		Thread.sleep(3000);
		n.conectarCliente("Urcuqui");
		x.pack();
		Thread.sleep(3000);
		n.conectarCliente("Julio");
		x.pack();
		Thread.sleep(3000);
		n.conectarCliente("X");
		x.pack();
		Thread.sleep(3000);
	    x.pack();
	    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    System.exit(0);
	}
	public PanelEspera() {
		setLayout(new BorderLayout());
		numConectados = 1;
		banner = new JLabel();
		ImageIcon bn = new ImageIcon("./docs/imgs/bannerEspera.jpg");
		banner.setIcon(bn);
		this.add(banner, BorderLayout.NORTH);
		panelConectados = new JPanel();	
		panelConectados.setLayout(new GridLayout(5,1));
		panelConectados.setBackground(Color.DARK_GRAY);
		this.add(panelConectados, BorderLayout.CENTER);
		
		
	}
	
	public void conectarCliente (String nickname) {
		if(numConectados == 6) {
			JOptionPane.showMessageDialog(this, "No se puede conectar otro jugador", "Lo lamentamos",JOptionPane.ERROR_MESSAGE);
		}
		else {
			auxConectarCliente(nickname);
			numConectados++;
		}
	}
	public void auxConectarCliente(String nk) {
		JPanel panelaux = new JPanel();
		panelaux.setLayout(new GridLayout(1,3));
		panelaux.setBackground(Color.DARK_GRAY);
		JLabel nickname = new JLabel ("Nickname: '" + nk + "'");
		nickname.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		nickname.setAlignmentY(JLabel.CENTER_ALIGNMENT);
		nickname.setForeground(Color.WHITE);
		nickname.setBackground(Color.DARK_GRAY);
		JLabel pic = new JLabel();
		ImageIcon img = new ImageIcon("./docs/imgs/"+numConectados+".jpg");
		pic.setIcon(img);
		pic.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		pic.setAlignmentY(JLabel.CENTER_ALIGNMENT);
		JLabel estado = new JLabel("ESTADO: ACTIVO");
		estado.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		estado.setAlignmentY(JLabel.CENTER_ALIGNMENT);
		estado.setSize(100, 100);
		estado.setForeground(Color.WHITE);
		estado.setBackground(Color.DARK_GRAY);
		
		panelaux.add(pic);
		panelaux.add(nickname);
		panelaux.add(estado);
		panelConectados.add(panelaux);
		refrescarConectados();
		
	}
	public void refrescarConectados() {
		panelConectados.repaint();
	}
}
