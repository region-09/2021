import java.awt.*;
import javax.swing.*;


public class Main extends MyPanel{

    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        JFrame jf = new JFrame("JFrame example");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("Click");
        b.setBounds(10, 10, 60, 20);
        b.setVisible(true);
        jf.setVisible(true);
        jf.add(b);
        jf.add(panel);
    }
}
class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(30,30,30,30);
    }
}
