import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Main extends JPanel{
    Scanner sc = new Scanner(System.in);
    static int x = 110;
    static int y = 110;

    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame example");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Main());
        jf.setVisible(true);
    }
    public Main() {
        setBackground(Color.black);
        JButton b = new JButton("Click");
        b.setBounds(10, 10, 60, 20);
        b.setVisible(true);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x,y,30,30);
    }
}

/*JFrame jf = new JFrame("JFrame example");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);*/
