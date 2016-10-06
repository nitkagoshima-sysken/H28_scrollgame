package package01;

import java.util.TimerTask;

public class Timers extends TimerTask
{

	public void run()
	{
		//ボタン入力より一定時間経過後の処理
		StartFrame.frame.setVisible(false);
		//名前入力フレームへの移動処理
		PlayerNameFrame.main(null);
	}
}