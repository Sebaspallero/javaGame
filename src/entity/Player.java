package entity;
import java.awt.Color;
import java.awt.Graphics2D;

import main.GamePanel;
import main.KeyHandler;


public class Player extends Entity{

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
    }

    public void setDefaultValues(){
        //SET PLAYER INITIAL POSITION
        x = 100;
        y = 100;
         //HOW MUCH WILL THE PLAYER MOVE ON THE GAME SCREEN
        speed = 4;
    }

    public void update(){
        //UPDATE THE PLAYER POSITION
        if (keyH.upPressed == true) {
            y = y - speed;
        } 

        else if (keyH.downPressed == true) {
            y = y + speed;
        }

        else if (keyH.leftPressed == true) {
            x = x - speed;
        }

        else if (keyH.rightPressed == true) {
            x = x + speed;
        }
    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.white);
        g2.fillRect(x, y, gp.getTILE_SIZE(), gp.getTILE_SIZE());
    }
}
