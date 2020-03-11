import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JTextField textfield;
    private JButton pushButton;
    private JButton popButton;
    private JList stackList;
    public JPanel panel1;
    private JLabel lblAnswer;
    private JLabel lblPeeked;
    private JButton peekButton;
    private JButton clearButton;
    private Stack<Integer> stack = new Stack<>();
    private DefaultListModel<Integer> model = new DefaultListModel();

    public Form() {

        stackList.setModel(model);

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String text = textfield.getText();
                    Integer num = Integer.parseInt(text);
                    stack.push(num);
                    model.addElement(num);
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null,  "Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (model.size() > 0) {
                    model.remove(model.size() - 1);
                    String text = stack.pop().toString();
                    lblAnswer.setText(String.format("Popped item: %s", text));
                }
                else {
                    JOptionPane.showMessageDialog(null, "No values in the stack!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        peekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Integer value = stack.peek();
                if (value == null) {
                    JOptionPane.showMessageDialog(null, "No values in the stack!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    lblPeeked.setText("Peeked value: " + value);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stack.clear();
                model.clear();
            }
        });
    }
}
