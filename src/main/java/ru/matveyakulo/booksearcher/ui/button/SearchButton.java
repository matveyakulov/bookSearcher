package ru.matveyakulo.booksearcher.ui.button;

import org.springframework.web.client.RestTemplate;
import ru.matveyakulo.booksearcher.ui.SearchWindow;

import javax.swing.*;
import java.awt.*;

public class SearchButton extends JButton {

    private final String leninkaUrl = "https://cyberleninka.ru/search?q=";
    private final TextField textField;
    private final SearchWindow searchWindow;
    private final RestTemplate restTemplate = new RestTemplate();

    public SearchButton(TextField textField, SearchWindow searchWindow) {
        setText("Начать поиск");
        this.textField = textField;
        this.searchWindow = searchWindow;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        addActionListener(e -> {
            String answer = restTemplate.getForEntity(leninkaUrl + textField.getText(), String.class).getBody();
            JOptionPane.showMessageDialog(HtmlParser.parseText(searchWindow, answer));
        });
    }
}
