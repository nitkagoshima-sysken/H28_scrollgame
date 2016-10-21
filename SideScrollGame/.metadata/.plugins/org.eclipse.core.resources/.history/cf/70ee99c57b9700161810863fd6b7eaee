package package01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

/*
 * Created on 2005/06/24
 *
 */

/**
 * @author mori
 *
 */
public abstract class Sprite {
    // 位置
    protected double x;
    protected double y;
    
    // 幅
    protected int pwidth;
    protected int kwidth;
    protected int width;
    // 高さ
    protected int pheight;
    protected int kheight;
    protected int height;
    
    // スプライト画像
    protected static Image playerimage;
    protected static Image kuriboimage;

    // アニメーション用カウンタ
    protected int count;

    // マップへの参照
    protected Map map;

    public Sprite(double x, double y, Map map) {
        this.x = x;
        this.y = y;
        this.map = map;

        pwidth = 32;
        pheight = 64;
        
        kwidth=32;
        kheight=32;
        

        // イメージをロードする
        loadImage();

        count = 0;
        
        // アニメーション用スレッドを開始
        AnimationThread thread = new AnimationThread();
        thread.start();
    }

    /**
     * スプライトの状態を更新する
     */
    public abstract void update();

    /**
     * スプライトを描画
     * 
     * @param g 描画オブジェクト
     * @param offsetX X方向オフセット
     * @param offsetY Y方向オフセット
     */
    public abstract void draw(Graphics g, int offsetX, int offsetY);

    /**
     * 他のスプライトと接触しているか
     * @param sprite スプライト
     */
    public boolean isCollision(Sprite sprite) {
        Rectangle playerRect = new Rectangle((int)x, (int)y, pwidth, pheight);
        Rectangle spriteRect = new Rectangle((int)sprite.getX(), (int)sprite.getY(), sprite.getWidth(sprite), sprite.getHeight(sprite));
        // 自分の矩形と相手の矩形が重なっているか調べる
        if (playerRect.intersects(spriteRect)) {
            return true;
        }
        
        return false;
    }

    /**
     * @return Returns the x.
     */
    public double getX() {
        return x;
    }
    /**
     * @return Returns the y.
     */
    public double getY() {
        return y;
    }
    /**
     * @return Returns the width.
     */
    public int getWidth(Sprite sprite) {
    	if(sprite instanceof Kuribo)
    	{
    		return kwidth;
    	}
    	else if(sprite instanceof Player)
    	{
    		return pwidth;
    	}
		return 0;
    }
    /**
     * @return Returns the height.
     */
    public int getHeight(Sprite sprite) {
    	if(sprite instanceof Kuribo)
    	{
    		return kheight;
    	}
    	else if(sprite instanceof Player)
    	{
    		return pheight;
    	}
		return 0;
    }

    /**
     * イメージをロードする
     * @param filename イメージファイル名
     */
    protected static void loadImage() {
        ImageIcon icon = new ImageIcon( "./Resource/情報（側面）静止.jpg");
        playerimage = icon.getImage();
        icon=new ImageIcon( "./Resource/kuribo.gif");
        kuriboimage=icon.getImage();
    }

    // アニメーション用スレッド
    private class AnimationThread extends Thread {
        public void run() {
            while (true) {
                // countを切り替える
                if (count == 0) {
                    count = 1;
                } else if (count == 1) {
                    count = 0;
                }

                // 300ミリ秒休止＝300ミリ秒おきに勇者の絵を切り替える
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
