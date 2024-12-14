package org.example;

import javax.swing.*;
import java.awt.*;

public class Sanbox {

    private final JFrame frame;
    private final JPanel panel;

    public Sanbox() {
        frame = new JFrame("Expert system");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(128,128,128));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton selectButton = new JButton("Вибрати");
        panel.add(selectButton);

        frame.add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Sanbox gui = new Sanbox();
            gui.frame.setVisible(true);
        });
    }
}
