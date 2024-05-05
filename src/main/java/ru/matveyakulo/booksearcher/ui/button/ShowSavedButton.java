package ru.matveyakulo.booksearcher.ui.button;

import ru.matveyakulo.booksearcher.repository.ArticleRepository;
import ru.matveyakulo.booksearcher.service.ArticleService;
import ru.matveyakulo.booksearcher.service.ArticleServiceImpl;

import javax.swing.*;
import java.awt.*;

public class ShowSavedButton extends JButton {

    private final ArticleService articleService;

    public ShowSavedButton() {
        setText("Показать сохраненные статьи");
        this.articleService = new ArticleServiceImpl(new ArticleRepository());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        addActionListener(e -> {
            JOptionPane.showMessageDialog(new Frame(), articleService.findAll());
        });
    }
}
