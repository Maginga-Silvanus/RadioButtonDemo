import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    JLabel imageLabel;
    ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        birdButton = new JRadioButton("Bird\n");
        catButton = new JRadioButton("Cat\n");
        dogButton = new JRadioButton("Dog\n");
        rabbitButton = new JRadioButton("Rabbit\n");
        pigButton = new JRadioButton("Pig\n");

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        imageLabel = new JLabel();
        add(imageLabel);

        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        pigButton.setSelected(true);
        updateImage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateImage();
    }

    private void updateImage() {
        if (birdButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/bird.jpeg"));
            JOptionPane.showMessageDialog(this, "You selected Bird");
        } else if (catButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/cat.jpeg"));
            JOptionPane.showMessageDialog(this, "You selected Cat");
        } else if (dogButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/dog.jpeg"));
            JOptionPane.showMessageDialog(this, "You selected Dog");
        } else if (rabbitButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/rabbit.jpeg"));
            JOptionPane.showMessageDialog(this, "You selected Rabbit");
        } else if (pigButton.isSelected()) {
            imageLabel.setIcon(new ImageIcon("images/pig.jpeg"));
            JOptionPane.showMessageDialog(this, "You selected Pig");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonDemo().setVisible(true);
            }
        });
    }
}
