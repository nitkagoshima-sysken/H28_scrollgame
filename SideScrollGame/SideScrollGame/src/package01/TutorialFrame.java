package package01;

import java.awt.Container;

import javax.swing.JFrame;

/*
 * Created on 2005/06/06
 *
 */

/**
 * @author mori
 *
 */
public class TutorialFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static TutorialFrame frame;

	public TutorialFrame() {
        // タイトルを設定
        setTitle("アイテムブロック");
        // サイズ変更不可
        setResizable(false);

        // メインパネルを作成してフレームに追加
        WalkMain panel = new WalkMain("./Resource/map.txt");
        Container contentPane = getContentPane();
        contentPane.add(panel);

        // パネルサイズに合わせてフレームサイズを自動設定
        pack();
    }

    public static void main(String[] args) {
        frame = new TutorialFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

