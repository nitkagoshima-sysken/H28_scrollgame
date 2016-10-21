package package01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

public class Enemy2 extends Sprite
{
	//スピード
	private static final double SPEED=2;
	
	//速度
	protected double vx;
	protected double vy;
	
	//体力
	protected int eHp2=80;
	
	//最大体力
	protected int emHp2=80;

	public Enemy2(double x, double y, Map map)
	{
		super(x, y, map);
		vx=-SPEED;
		vy=0;
	}

	@Override
	public void update()
	{
		// 重力で下向きに加速度がかかる
        vy += Map.GRAVITY;

        // x方向の当たり判定
        // 移動先座標を求める
        double newX = x + vx;
        // 移動先座標で衝突するタイルの位置を取得
        // x方向だけ考えるのでy座標は変化しないと仮定
        Point tile = map.getTileCollision(this, newX, y);
        if (tile == null) {
            // 衝突するタイルがなければ移動
            x = newX;
        } else {
            // 衝突するタイルがある場合
            if (vx > 0) { // 右へ移動中なので右のブロックと衝突
                // ブロックにめりこむ or 隙間がないように位置調整
                x = Map.tilesToPixels(tile.x) - e2width;
            } else if (vx < 0) { // 左へ移動中なので左のブロックと衝突
                // 位置調整
                x = Map.tilesToPixels(tile.x + 1);
            }
            // 移動方向を反転
            vx = -vx;
        }

        // y方向の当たり判定
        // 移動先座標を求める
        double newY = y + vy;
        // 移動先座標で衝突するタイルの位置を取得
        // y方向だけ考えるのでx座標は変化しないと仮定
        tile = map.getTileCollision(this, x, newY);
        if (tile == null) {
            // 衝突するタイルがなければ移動
        	vx=-vx;
        } else {
            // 衝突するタイルがある場合
            if (vy > 0) { // 下へ移動中なので下のブロックと衝突（着地）
                // 位置調整
                y = Map.tilesToPixels(tile.y) - e2height;
                // 着地したのでy方向速度を0に
                vy = 0;
            } else if (vy < 0) { // 上へ移動中なので上のブロックと衝突（天井ごん！）
                // 位置調整
                y = Map.tilesToPixels(tile.y + 1);
                // 天井にぶつかったのでy方向速度を0に
                vy = 0;
            }
        }
	}

	@Override
	public void draw(Graphics g, int offsetX, int offsetY)
	{
		g.drawImage(enemy2image,
                (int) x + offsetX, (int) y + offsetY, 
                (int) x + offsetX + e2width, (int) y + offsetY + e2height,
                0, 0,
                e2width, e2height,
                null);
   	  Graphics2D g2=(Graphics2D)g;
         //体力バー描画
           g2.setColor(Color.WHITE);
           g2.draw(new Rectangle2D.Double((int)x+offsetX,(int)y+offsetY-10,32,5));
           g2.setColor(Color.RED);
           g2.fill(new Rectangle2D.Double((int)x+offsetX,(int)y+offsetY-10,32*(eHp2/emHp2),4));
	}

}
