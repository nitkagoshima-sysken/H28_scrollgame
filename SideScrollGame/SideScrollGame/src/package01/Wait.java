package package01;

import java.util.concurrent.TimeUnit;

public class Wait extends Thread
{
	public void run()
	{
		try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		WalkMain.Hpflug=true;
	}
}
