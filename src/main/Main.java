package main;
import javax.swing.JFrame;

public class Main {

    JFrame window;
    public static void main(String[] args) {

        new Main();
    }
    
    public Main(){
        window = new JFrame("Eggy's Adventure");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Eggy's Adventure");

        GamePanel gamePanel = new GamePanel();

        window.add(gamePanel);
        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.startGameThread();

    }
}