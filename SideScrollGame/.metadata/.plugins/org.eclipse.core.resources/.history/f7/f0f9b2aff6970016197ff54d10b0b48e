package package01;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class DepartmentFrame extends JFrame implements MouseListener{
	
	public static final long serialVersionUID = 1L;
	//機械画像アドレス
	ImageIcon icon=new ImageIcon("./Resource/sorry100px.png");
	//電気画像アドレス
	ImageIcon icon1=new ImageIcon("./Resource/sorry100px.png");
	//制御画像アドレス
	ImageIcon icon2=new ImageIcon("./Resource/sorry100px.png"); 
	//情報画像アドレス
	ImageIcon icon3=new ImageIcon("./Resource/pc100px.png");
	//都市環画像アドレス
	ImageIcon icon4=new ImageIcon("./Resource/sorry100px.png");
	//背景画像アドレス
	//ImageIcon icon5=new ImageIcon("./Resource/sorry.png");
	private JPanel contentPane;
	
	public  static int ck=0;
	private static DepartmentFrame frame;
	private static JButton KikaiButton;
	private static JButton DenkiButton;
	private static JButton SeigyoButton;
	private static JButton JouhouButton;
	private static JButton TosikanButton;
	private static JButton KakuteiButton;
	private static JLabel lab;
	private static BevelBorder bo=new BevelBorder(BevelBorder.RAISED);
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel lbl;
	private JLabel lblNewLabel_5;
	private JLabel lab2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame=new DepartmentFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DepartmentFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,1280,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1000, 600);
		panel_1.setBorder(bo);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		//機械工学科ボタン
		KikaiButton = new JButton("");
		KikaiButton.setBounds(100, 100, 100, 100);
		KikaiButton.setIcon(icon);
		KikaiButton.setContentAreaFilled(false);
		KikaiButton.setBorderPainted(false);
		KikaiButton.addMouseListener(this);
		panel_1.add(KikaiButton);
		//機械工学科ボタン終
		//電気工学科ボタン
		DenkiButton = new JButton("");
		DenkiButton.setBounds(200, 300, 100, 100);
		DenkiButton.setIcon(icon1);
		DenkiButton.setContentAreaFilled(false);
		DenkiButton.setBorderPainted(false);
	    DenkiButton.addMouseListener(this);
		panel_1.add(DenkiButton);
		//電気工学科ボタン終
		//制御工学科ボタン
		SeigyoButton = new JButton("");
		SeigyoButton.setBounds(400, 100, 100, 100);
		SeigyoButton.setIcon(icon2);
		SeigyoButton.setContentAreaFilled(false);
		SeigyoButton.setBorderPainted(false);
		SeigyoButton.addMouseListener(this);
		panel_1.add(SeigyoButton);
		//制御工学科ボタン終
		//情報工学科ボタン
		JouhouButton = new JButton("");
		JouhouButton.setBounds(550, 7, 100, 100);
		JouhouButton.setIcon(icon3);
		JouhouButton.setContentAreaFilled(false);
		JouhouButton.setBorderPainted(false);
		JouhouButton.addMouseListener(this);
		panel_1.add(JouhouButton);
		//情報工学科ボタン終
		//都市環ボタン
		TosikanButton = new JButton("");
		TosikanButton.setBounds(700, 200, 100, 100);
		TosikanButton.setIcon(icon4);
		TosikanButton.setContentAreaFilled(false);
		TosikanButton.setBorderPainted(false);
		TosikanButton.addMouseListener(this);
		panel_1.add(TosikanButton);
		//都市環ボタン
		//背景設置用ラベル
		//JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(icon5);
		//lblNewLabel.setBounds(0, 0, 1000, 600);
		//panel_1.add(lblNewLabel);
		
		//確定ボタン
		KakuteiButton = new JButton("確定！");
		KakuteiButton.setBounds(0, 0, 262, 100);
		KakuteiButton.addMouseListener(this);
		
		//パネル設定
		panel_2 = new JPanel();
		panel_2.setBounds(0, 600, 1265, 80);
		panel_2.setBorder(bo);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_5 = new JLabel("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　画像をクリック後確定ボタンで次に進みます");
		lblNewLabel_5.setBounds(0, 0, 1262, 80);
		panel_2.add(lblNewLabel_5);
		
		panel_3 = new JPanel();
		panel_3.setBounds(1000, 0, 264, 100);
		panel_3.setBorder(bo);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lab2 = new JLabel("");
		lab2.setBounds(0, 0, 264, 100);
		panel_3.add(lab2);
		
		panel_5 = new JPanel();
		panel_5.setBounds(1000, 100, 265, 400);
		panel_5.setBorder(bo);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBorder(bo);
		panel_6.setBounds(1000, 500, 264, 98);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		//説明文用ラベル
		lab= new JLabel("");
		lab.setBounds(0, 0, 263, 230);
		panel_5.add(lab);
		
		//難易度用ラベル
		lbl = new JLabel("　　　　　　　     難易度");
		lbl.setBounds(0, 230, 263, 60);
		panel_5.add(lbl);
		
		
		panel_6.add(KakuteiButton);
		
	}
	//マウスクリック時処理
	public void mouseClicked(MouseEvent e)
	{
		Object ob=e.getSource();
		KikaiButton.setContentAreaFilled(false);
		DenkiButton.setContentAreaFilled(false);
		SeigyoButton.setContentAreaFilled(false);
		JouhouButton.setContentAreaFilled(false);
		TosikanButton.setContentAreaFilled(false);
		if(ob==KikaiButton)
		{
			KikaiButton.setContentAreaFilled(true);
			KikaiButton.setBackground(Color.RED);
			lab.setText("　　　　　　　　機械です");
			lab2.setText("　　　　　　　　機械工学科");
			lbl.setText("　　　　　　　     難易度★");
			ck=0;
		}
		else if(ob==DenkiButton)
		{
			DenkiButton.setContentAreaFilled(true);
			DenkiButton.setBackground(Color.YELLOW);
			lab.setText("　　　　　　　　電気です");
			lab2.setText("　　　　　　　　電気電子工学科");
			lbl.setText("　　　　　　　     難易度★");
			ck=0;
		}
		else if(ob==SeigyoButton)
		{
			SeigyoButton.setContentAreaFilled(true);
			SeigyoButton.setBackground(Color.GREEN);
			lab.setText("　　　　　　　　制御です");
			lab2.setText("　　　　　　　　電子制御工学科");
			lbl.setText("　　　　　　　     難易度★");
			ck=0;
		}
		else if(ob==JouhouButton)
		{
			JouhouButton.setContentAreaFilled(true);
			JouhouButton.setBackground(Color.BLUE);
			lab.setText("　　　　　　　　情報です");
			lab2.setText("　　　　　　　　情報工学科");
			lbl.setText("　　　　　　　     難易度★");
			ck=4;
		}
		else if(ob==TosikanButton)
		{
			TosikanButton.setContentAreaFilled(true);
			TosikanButton.setBackground(Color.WHITE);
			lab.setText("　　　　　　　　都市環です");
			lab2.setText("　　　　　　　　都市環境デザイン工学科");
			lbl.setText("　　　　　　　     難易度★");
			ck=0;
		}
		else if(ob==KakuteiButton)
		{
			if(ck!=0)
			{
				frame.setVisible(false);
				TutorialFrame.main(null);
			}
			else if(ck==0)
			{
				lab.setText("      学科を選択してください");
			}
		}
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e)
	{
		
	}
	
	//ボタンエリアへ入った際の処理
	public void mouseEntered(MouseEvent e)
	{
		Object obj =e.getSource();
		if(ck==0)
		{
			if(obj==KikaiButton)
			{
				lab.setText("　　　　　　　　機械です");
				lab2.setText("　　　　　　　　機械工学科");
				lbl.setText("　　　　　　　     難易度★");
			}
			else if(obj==DenkiButton)
			{
				lab.setText("　　　　　　　　電気です");
				lab2.setText("　　　　　　　　電気電子工学科");
				lbl.setText("　　　　　　　     難易度★");
			}
			else if(obj==SeigyoButton)
			{
				lab.setText("　　　　　　　　制御です");
				lab2.setText("　　　　　　　　電子制御工学科");
				lbl.setText("　　　　　　　     難易度★");
			}
			else if(obj==JouhouButton)
			{
				lab.setText("　　　　　　　　情報です");
				lab2.setText("　　　　　　　　情報工学科");
				lbl.setText("　　　　　　　     難易度★");
			}
			else if(obj==TosikanButton)
			{
				lab.setText("　　　　　　　　都市環です");
				lab2.setText("　　　　　　　　都市環境デザイン工学科");
				lbl.setText("　　　　　　　     難易度★");
			}
		}
	}

	//ボタンエリアから出た際の処理
	public void mouseExited(MouseEvent e)
	{
		if(ck==0)
		{
			lab.setText("");
			lab2.setText("");
			lbl.setText("　　　　　　　     難易度");
		}
	}
}
