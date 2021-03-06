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

        // Setting the model to my custom model.
        stackList.setModel(model);

        // Pushing a number
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                // Error catching
                try {
                    // Getting the number, putting it in the stack and in the model
                    String text = textfield.getText();
                    Integer num = Integer.parseInt(text);
                    stack.push(num);
                    model.addElement(num);
                }
                catch (Exception e) {
                    // Alert the user that their input is invalid
                    JOptionPane.showMessageDialog(null,  "Please enter an integer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (model.size() > 0) {
                    // Popping the top value from the stack and the model
                    model.remove(model.size() - 1);
                    String text = stack.pop().toString();
                    lblAnswer.setText(String.format("Popped item: %s", text));
                }
                else {
                    // Alert the user that there are no values to pop
                    JOptionPane.showMessageDialog(null, "No values in the stack!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        peekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Peeking the value from the stack
                Integer value = stack.peek();
                if (value == null) {
                    // Alert the user that there are no values in the stack
                    JOptionPane.showMessageDialog(null, "No values in the stack!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    // Showing the user the peeked value
                    lblPeeked.setText("Peeked value: " + value);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Clearing the stack and the model
                stack.clear();
                model.clear();
            }
        });
    }
}
