package ru.matveyakulo.booksearcher.ui;

import ru.matveyakulo.booksearcher.ui.button.SearchButton;
import ru.matveyakulo.booksearcher.ui.button.ShowSavedButton;

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
        verticalBox.add(label, BorderLayout.CENTER);
        TextField textField = new TextField();
        textField.setSize(20, 10);
        verticalBox.add(textField, BorderLayout.CENTER);
        SearchButton startSearchButton = new SearchButton(textField, this);
        startSearchButton.setSize(10, 10);
        verticalBox.add(startSearchButton, BorderLayout.CENTER);
        ShowSavedButton button = new ShowSavedButton();
        button.setSize(10, 10);
        verticalBox.add(button, BorderLayout.CENTER);
        setVisible(true);
        setSize(300, 150);
        setLocation(0, 0);
    }
}
