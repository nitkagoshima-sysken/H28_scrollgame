package package01;

import java.awt.Graphics;

public class Goal extends Sprite {

	public Goal(double x, double y, Map map) {
		super(x, y, map);
		
	}

	@Override
	public void update() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void draw(Graphics g, int offsetX, int offsetY) 
	{
		 g.drawImage(goalImage,
                 (int) x + offsetX, (int) y + offsetY, 
                 (int) x + offsetX + gwidth, (int) y + offsetY + gheight,
                 0, 0,gwidth, gheight,
                 null);
	}

}
