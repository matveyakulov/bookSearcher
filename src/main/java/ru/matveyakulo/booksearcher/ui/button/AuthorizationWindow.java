package ru.matveyakulo.booksearcher.ui.button;

import javax.swing.*;
import java.awt.*;

public class AuthorizationWindow extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        JPanel panel = new JPanel(new GridLayout(10,10,10,10));
        setLayout(new FlowLayout());
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label label = new Label("Введите свою почту");
        label.setSize(20, 10);
        panel.add(label, BorderLayout.CENTER);
        TextField textField = new TextField();
        textField.setSize(20, 10);
        panel.add(textField, BorderLayout.CENTER);
        JButton startSearchButton = new JButton("Войти");
        startSearchButton.setPreferredSize(new Dimension(200, 30));
        panel.add(startSearchButton, BorderLayout.CENTER);
        setVisible(true);
        setSize(600, 450);
        setLocation(0, 0);
    }
}
