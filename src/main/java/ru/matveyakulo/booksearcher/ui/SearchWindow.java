package ru.matveyakulo.booksearcher.ui;

import javax.swing.*;
import java.awt.*;

public class SearchWindow extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        Box verticalBox = Box.createVerticalBox();
        JScrollPane scroll = new JScrollPane(verticalBox);
        scroll.setVisible(true);
        add(scroll);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label label = new Label("Ключевые слова для поиска");
        label.setSize(20, 10);
        verticalBox.add(new Label("Ключевые слова для поиска"), BorderLayout.CENTER);
        TextField textField = new TextField();
        textField.setSize(20, 10);
        verticalBox.add(textField, BorderLayout.CENTER);
        Label startSearchButton = new Label("Начать поиск");
        startSearchButton.setSize(10, 10);
        verticalBox.add(startSearchButton, BorderLayout.CENTER);
        Label button = new Label("Показать сохраненные статьи");
        button.setSize(10, 10);
        verticalBox.add(button, BorderLayout.CENTER);
        setVisible(true);
        setSize(300, 150);
        setLocation(0, 0);
    }
}
