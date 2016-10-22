package package01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;



public class RankingFrame extends JFrame {
	public static int dep=1;
	public static String myname,ntemp;
	public static final long serialVersionUID = 1L;
	public static RankingFrame Rankframe;
	private JPanel contentPane;
	public static int i=0,j=0,stemp=0,a=0,myscoa=0,s=0,b=0;
	public static int scoa[] = new int[8];
	public static String name[] = new String[8];




	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {

		scoa[7]=myscoa;
		name[7]=myname;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rankframe =new RankingFrame();
					Rankframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public RankingFrame() {
		setTitle("ランキング");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel label_1 = new JLabel("一位");
		label_1.setBounds(52, 130, 128, 42);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("二位");
		label_2.setBounds(52, 201, 128, 42);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("三位");
		label_3.setBounds(52, 271, 128, 42);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("四位");
		label_4.setBounds(52, 341, 128, 42);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("語彙");
		label_5.setBounds(52, 432, 128, 42);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("六位");
		label_6.setBounds(52, 508, 128, 42);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("七位");
		label_7.setBounds(52, 576, 128, 42);
		contentPane.add(label_7);

		//読み込み
		if(dep==1){//M
			try{
				File rankM = new File("./Resource/Ranking/Mrank.txt");
				File nameM = new File("./Resource/Player_data/Mdata.txt");
				Scanner rscanM = new Scanner(rankM);
				Scanner nscanM = new Scanner(nameM);
				rscanM.useDelimiter("\\r\\n");
				nscanM.useDelimiter("\\r\\n");
				while(rscanM.hasNextInt()&&j<=6){
					scoa[j] = rscanM.nextInt();
					name[j] = nscanM.next();
					j++;

				}
			}catch(FileNotFoundException e){
				System.out.println(e);
			}
		}else if(dep==2){//E
			try{
				File rankE = new File("./Resource/Ranking/Erank.txt");
				File nameE = new File("./Resource/Player_data/Edata.txt");
				Scanner rscanE = new Scanner(rankE);
				Scanner nscanE = new Scanner(nameE);
				rscanE.useDelimiter("\\r\\n");
				nscanE.useDelimiter("\\r\\n");
				while(rscanE.hasNextInt()&&j<=6){
					scoa[j] = rscanE.nextInt();
					name[j] = nscanE.next();
					j++;

				}
			}catch(FileNotFoundException e){
				System.out.println(e);
			}
		}else if(dep==3){//S
			try{
				File rankS = new File("./Resource/Ranking/Srank.txt");
				File nameS = new File("./Resource/Player_data/Sdata.txt");
				Scanner rscanS = new Scanner(rankS);
				Scanner nscanS = new Scanner(nameS);
				rscanS.useDelimiter("\\r\\n");
				nscanS.useDelimiter("\\r\\n");
				while(rscanS.hasNextInt()&&j<=6){
					scoa[j] = rscanS.nextInt();
					name[j] = nscanS.next();
					j++;

				}
			}catch(FileNotFoundException e){
				System.out.println(e);
			}
		}else if(dep==4){//I
			try{
				File rankI = new File("./Resource/Ranking/Irank.txt");
				File nameI = new File("./Resource/Player_data/Idata.txt");
				Scanner rscanI = new Scanner(rankI);
				Scanner nscanI = new Scanner(nameI);
				rscanI.useDelimiter("\\r\\n");
				nscanI.useDelimiter("\\r\\n");
				while(rscanI.hasNextInt()&&j<=6){
					scoa[j] = rscanI.nextInt();
					name[j] = nscanI.next();
					j++;

				}
			}catch(FileNotFoundException e){
				System.out.println(e);
			}
		}else if(dep==5){//C
			try{
				File rankC = new File("./Resource/Ranking/Crank.txt");
				File nameC = new File("./Resource/Player_data/Cdata.txt");
				Scanner rscanC = new Scanner(rankC);
				Scanner nscanC = new Scanner(nameC);
				rscanC.useDelimiter("\\r\\n");
				nscanC.useDelimiter("\\r\\n");
				while(rscanC.hasNextInt()&&j<=6){
					scoa[j] = rscanC.nextInt();
					name[j] = nscanC.next();
					j++;

				}
			}catch(FileNotFoundException e){
				System.out.println(e);
			}
		}


		//並び替え
		for(j=0;j<=7;j++){
			for(a=j+1;a<=7;a++){
				if(scoa[j]<scoa[a]){
					stemp=scoa[j];
					ntemp=name[j];//name
					scoa[j]=scoa[a];
					name[j]=name[a];//name
					scoa[a]=stemp;
					name[a]=ntemp;//name
				}

			}

		}
		//書き込み
		if(dep==1){//M
			try{
				File fileM = new File("./Resource/Ranking/Mrank.txt");
				File nM = new File("./Resource/Player_data/Mdata.txt");
				FileWriter fwM = new FileWriter(fileM,false);
				FileWriter fwnM= new FileWriter(nM,false);
				for(j=0;j<=6;j++){
					fwM.write(scoa[j]+"\r\n");
					fwnM.write(name[j]+"\r\n");
				}
				fwM.close();
				fwnM.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}else if(dep==2){//E
			try{
				File fileE = new File("./Resource/Ranking/Erank.txt");
				File nE = new File("./Resource/Player_data/Edata.txt");
				FileWriter fwE = new FileWriter(fileE,false);
				FileWriter fwnE= new FileWriter(nE,false);
				for(j=0;j<=6;j++){
					fwE.write(scoa[j]+"\r\n");
					fwnE.write(name[j]+"\r\n");
				}
				fwE.close();
				fwnE.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}else if(dep==3){//S
			try{
				File fileS = new File("./Resource/Ranking/Srank.txt");
				File nS = new File("./Resource/Player_data/Sdata.txt");
				FileWriter fwS = new FileWriter(fileS,false);
				FileWriter fwnS= new FileWriter(nS,false);
				for(j=0;j<=6;j++){
					fwS.write(scoa[j]+"\r\n");
					fwnS.write(name[j]+"\r\n");
				}
				fwS.close();
				fwnS.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}else if(dep==4){//I
			try{
				File fileI = new File("./Resource/Ranking/Irank.txt");
				File nI = new File("./Resource/Player_data/Idata.txt");
				FileWriter fwI = new FileWriter(fileI,false);
				FileWriter fwnI= new FileWriter(nI,false);
				for(j=0;j<=6;j++){
					fwI.write(scoa[j]+"\r\n");
					fwnI.write(name[j]+"\r\n");
				}
				fwI.close();
				fwnI.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}else if(dep==5){//C
			try{
				File fileC = new File("./Resource/Ranking/Crank.txt");
				File nC = new File("./Resource/Player_data/Cdata.txt");
				FileWriter fwC = new FileWriter(fileC,false);
				FileWriter fwnC= new FileWriter(nC,false);
				for(j=0;j<=6;j++){
					fwC.write(scoa[j]+"\r\n");
					fwnC.write(name[j]+"\r\n");
				}
				fwC.close();
				fwnC.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}


		//確認
		for(j=0;j<=6;j++)System.out.println(scoa[j]);

		JLabel name_1 = new JLabel(name[0]);
		name_1.setBounds(226, 130, 128, 42);
		contentPane.add(name_1);


		JLabel name_2 = new JLabel(name[1]);
		name_2.setBounds(226, 201, 128, 42);
		contentPane.add(name_2);

		JLabel name_3 = new JLabel(name[2]);
		name_3.setBounds(226, 271, 128, 42);
		contentPane.add(name_3);

		JLabel name_4 = new JLabel(name[3]);
		name_4.setBounds(226, 341, 128, 42);
		contentPane.add(name_4);

		JLabel name_5 = new JLabel(name[4]);
		name_5.setBounds(226, 432, 128, 42);
		contentPane.add(name_5);

		JLabel name_6 = new JLabel(name[5]);
		name_6.setBounds(226, 508, 128, 42);
		contentPane.add(name_6);

		JLabel name_7 = new JLabel(name[6]);
		name_7.setBounds(226, 576, 128, 42);
		contentPane.add(name_7);

		JLabel scoa_1 = new JLabel(""+scoa[0]);
		scoa_1.setBounds(400, 130, 128, 42);
		contentPane.add(scoa_1);

		JLabel scoa_2 = new JLabel(""+scoa[1]);
		scoa_2.setBounds(400, 201, 128, 42);
		contentPane.add(scoa_2);

		JLabel scoa_3 = new JLabel(""+scoa[2]);
		scoa_3.setBounds(400, 271, 128, 42);
		contentPane.add(scoa_3);

		JLabel scoa_4 = new JLabel(""+scoa[3]);
		scoa_4.setBounds(400, 341, 128, 42);
		contentPane.add(scoa_4);

		JLabel scoa_5 = new JLabel(""+scoa[4]);
		scoa_5.setBounds(400, 432, 128, 42);
		contentPane.add(scoa_5);

		JLabel scoa_6 = new JLabel(""+scoa[5]);
		scoa_6.setBounds(400, 508, 128, 42);
		contentPane.add(scoa_6);

		JLabel scoa_7 = new JLabel(""+scoa[6]);
		scoa_7.setBounds(400, 576, 128, 42);
		contentPane.add(scoa_7);
		TimerTask task=new Times();
		Timer timer=new Timer();
		timer.schedule(task,TimeUnit.SECONDS.toMillis(5));
	}

}
