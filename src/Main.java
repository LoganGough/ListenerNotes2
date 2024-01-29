import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JPanel panel = new JPanel();

        JButton button = new JButton("Push");

        JLabel label = new JLabel("");
        JButton button2 = new JButton("Hello bob");

        JTextField textField = new JTextField(12);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("bye");

            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("hi");
                String name = textField.getText();
//                label.setText("Hello " + blah);
//                String name = textField.getName();
                if(name.equalsIgnoreCase("bob")){
                    JFrame frame2 = new JFrame();
                    JPanel panel2 = new JPanel();
                    frame2.setSize(500, 500);


                  panel2.setBackground(Color.RED);
                  frame2.add(panel2);
                  frame2.setVisible(true);


                }
            }
        });


        ImageIcon icons = new ImageIcon("images/pony.png");
        icons.setImage(icons.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));
        JLabel picsLabel = new JLabel(icons);
        panel.add(picsLabel);

        panel.add(textField);
        panel.add(button);
        panel.add(label);

        frame.add(panel);

        frame.setVisible(true);



    }
}