import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new Form().panel1);
        frame.pack();
        frame.setVisible(true);

    }
}
