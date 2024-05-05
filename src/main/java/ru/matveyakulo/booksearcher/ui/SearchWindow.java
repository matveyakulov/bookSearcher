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
        JPanel panel = new JPanel(new GridLayout(10,10,10,10));
        setLayout(new FlowLayout());
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label label = new Label("Ключевые слова для поиска");
        label.setSize(20, 10);
        panel.add(label, BorderLayout.CENTER);
        TextField textField = new TextField();
        textField.setSize(20, 10);
        panel.add(textField, BorderLayout.CENTER);
        SearchButton startSearchButton = new SearchButton(textField, this);
        startSearchButton.setPreferredSize(new Dimension(200, 30));
        panel.add(startSearchButton, BorderLayout.CENTER);
        ShowSavedButton button = new ShowSavedButton();
        button.setPreferredSize(new Dimension(200, 30));
        panel.add(button, BorderLayout.CENTER);
        setVisible(true);
        setSize(600, 450);
        setLocation(0, 0);
    }
}
