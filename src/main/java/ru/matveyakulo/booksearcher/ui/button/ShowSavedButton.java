package ru.matveyakulo.booksearcher.ui.button;

import ru.matveyakulo.booksearcher.service.ArticleService;

import javax.swing.*;
import java.awt.*;

public class ShowSavedButton extends JButton {

    private final String text;
    private final ArticleService articleService;

    public ShowSavedButton(String text, ArticleService articleService) {
        this.text = text;
        this.articleService = articleService;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        addActionListener(e -> {
            JOptionPane.showMessageDialog(new Frame(), articleService.findAll());
        });
    }
}
