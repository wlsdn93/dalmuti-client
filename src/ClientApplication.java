import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ClientApplication extends JFrame {
    public ClientApplication() {
        setTitle("The Great Dalmuti");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.GRAY);
        contentPane.add(new JButton("Hello"));
        contentPane.add(new JButton("Good Bye"));
        contentPane.setLayout(new FlowLayout());
        setSize(600, 600);
        setVisible(true);
    }
    // swing 연습중 :D
    public static void main(String[] arg) {
        ClientApplication cApp = new ClientApplication();
    }
}
