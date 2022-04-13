import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myclass extends Frame {
    myclass() {
        setTitle("");
        setSize(420, 420);
        setLayout(null);
        setLocation(450, 450);
        Label LabelA = new Label("a");
        LabelA.setBounds(55, 55, 30, 30);
        Label LabelB = new Label("b");
        LabelB.setBounds(55, 85, 30, 30);
        Label LabelSum = new Label("sum");
        LabelSum.setBounds(55, 110, 30, 25);
        TextField textFieldA = new TextField();
        textFieldA.setBounds(100, 50, 50, 25);
        TextField textFieldB = new TextField();
        textFieldB.setBounds(100, 80, 50, 25);
        TextField textFieldSum = new TextField();
        textFieldSum.setBounds(100, 110, 50, 25);
        add(LabelA);
        add(textFieldA);
        add(LabelB);
        add(textFieldB);
        add(LabelSum);
        add(textFieldSum);


        Button calc = new Button("calculate");
        calc.setBounds(70, 140, 70, 30);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ne) {
                try {
                    int a = Integer.parseInt(textFieldA.getText());
                    int b = Integer.parseInt(textFieldB.getText());
                    int sum = a + b;
                    textFieldSum.setText(Integer.toString(sum));
                } catch (NumberFormatException e) {
                    textFieldSum.setText("error");
                }
            }
        });

        Button clear = new Button("clear");
        clear.setBounds(70, 165, 70, 30);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldSum.setText("");
            }
        });
        add(calc);
        add(clear);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new myclass();
    }
}