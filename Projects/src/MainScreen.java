import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainScreen {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame("Ip Finder");
		jFrame.setBounds(100, 100, 1000, 100);
		jFrame.setVisible(true);
		
		JLabel label = new JLabel("Enter URL: ");
		label.setBounds(50, 70, 150, 20);
		
		JTextField textField = new JTextField();
		textField.setBounds(50, 100, 200, 20);
		
		JButton button = new JButton("Find IP");
		button.setBounds(50, 150, 80, 30);
		
		button.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String url = textField.getText();
				try {
					InetAddress ia = InetAddress.getByName(url);
					String ip = ia.getHostAddress();
					JOptionPane.showMessageDialog(jFrame, ip);
					
				}catch (java.net.UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jFrame.add(label);
		jFrame.add(textField);
		jFrame.add(button);
		jFrame.setLayout(new GridLayout());

	}

}
