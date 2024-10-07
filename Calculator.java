import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
       public class Calculator extends JFrame implements ActionListener {
       private JPanel panel;
       private JTextField textField;
       private JButton[] buttons;
       private String[] buttonLabels = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
       private double currentResult = 0;
       private String currentOperator = "";
       private boolean startNewNumber = true;
       public Calculator() {
             super("Calculator");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             panel = new JPanel();
             panel.setLayout(new GridLayout(4, 4));
             textField = new JTextField();
             textField.setEditable(false);
             add(textField, BorderLayout.NORTH);
             buttons = new JButton[buttonLabels.length];
              for (int i = 0; i < buttonLabels.length; i++) {
buttons[i] = new JButton(buttonLabels[i]);
buttons[i].addActionListener(this);
panel.add(buttons[i]);
}
add(panel, BorderLayout.CENTER);
pack();
setVisible(true);
}
public void actionPerformed(ActionEvent event) {
String buttonText = event.getActionCommand();
if (buttonText.matches("[0-9.]")) {
if (startNewNumber) {
textField.setText(buttonText);
startNewNumber = false;
} else {
textField.setText(textField.getText() + buttonText);
}
} else if (buttonText.matches("[/*\\-+\\=]")) {
double currentValue = Double.parseDouble(textField.getText());
if (currentOperator.equals("")) {
currentResult = currentValue;
} else if (currentOperator.equals("+")) {
currentResult += currentValue;
} else if (currentOperator.equals("-")) {
currentResult -= currentValue;
} else if (currentOperator.equals("*")) {
currentResult *= currentValue;
} else if (currentOperator.equals("/")) {
currentResult /= currentValue;
}
if (buttonText.equals("=")) {
textField.setText(String.valueOf(currentResult));
currentOperator = "";
} else {
currentOperator = buttonText;
startNewNumber = true;
}
}
}
public static void main(String[] args) {
new Calculator();
}
}

