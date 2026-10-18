import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame() {
        this.setTitle("Riichi JMahjong");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setPreferredSize(new Dimension(1080, 720));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();

    }
}
