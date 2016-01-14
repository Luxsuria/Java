import javax.swing.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calc");
        frame.setSize(80, 160);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        String[] petStrings = { "+", "-", "/", "*" };

        final JTextField jTextField = new JTextField(10);
        jTextField.setBounds(0, 0, 80, 20);
        panel.add(jTextField);

        final JComboBox<String> method = new JComboBox<String>(petStrings);
        method.setBounds(0,20,80,30);
        panel.add(method);

        final JTextField jTextField1 = new JTextField(20);
        jTextField1.setBounds(0, 50, 80, 20);
        panel.add(jTextField1);

        JButton loginButton = new JButton("Solve");
        loginButton.setBounds(0, 70, 80, 25);

        final JLabel jLabel = new JLabel();
        jLabel.setBounds(0,95,80,25);
        panel.add(jLabel);

        loginButton.addActionListener(e -> {
                    String value;
                    int fValue = Integer.parseInt(jTextField.getText());
                    int sValue = Integer.parseInt(jTextField1.getText());
                    value=method.getSelectedItem().toString();
                    switch (value) {
                        case "+":
                            jLabel.setText(Integer.toString(fValue + sValue));
                            break;
                        case "-":
                            jLabel.setText(Integer.toString(fValue - sValue));
                            break;
                        case "*":
                            jLabel.setText(Integer.toString(fValue * sValue));
                            break;
                        case "/":
                            jLabel.setText(Float.toString((float) fValue / (float) sValue));
                            break;
                    }
                }
        );
        panel.add(loginButton);

    }
}