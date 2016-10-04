package package01;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;

public class StartFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * ÉXÉ^Å[ÉgâÊñ ÇÃÉtÉåÅ[ÉÄÇçÏê¨
	 */
	public StartFrame() {
		setTitle("\u30B2\u30FC\u30E0\u30BF\u30A4\u30C8\u30EB\uFF08\u4EEE\uFF09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u30B2\u30FC\u30E0\u30BF\u30A4\u30C8\u30EB\uFF08\u4EEE\uFF09");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setEnabled(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("HGPënâpäp∫ﬁºØ∏UB", Font.PLAIN, 60));
		lblNewLabel.setBounds(332, 254, 600, 80);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u30B2\u30FC\u30E0\u30B9\u30BF\u30FC\u30C8");
		btnNewButton.setFont(new Font("HGPënâpäp∫ﬁºØ∏UB", Font.PLAIN, 24));
		btnNewButton.setBounds(332, 409, 180, 28);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u30E9\u30F3\u30AD\u30F3\u30B0");
		btnNewButton_1.setFont(new Font("HGPënâpäp∫ﬁºØ∏UB", Font.PLAIN, 24));
		btnNewButton_1.setBounds(752, 409, 180, 28);
		contentPane.add(btnNewButton_1);
	}
}
