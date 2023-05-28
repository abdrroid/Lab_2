package com.company;
import javax.swing.*;

public class GUI extends JFrame {
    private JTextField wordField;
    private JTextArea resultArea;

    public GUI() {

        setTitle("Переварот слова");
        setSize(400, 200);

        JPanel panel = new JPanel();
        JLabel wordLabel = new JLabel("Введите значения:");
        wordField = new JTextField( 30);

        JLabel resultLabel = new JLabel("Результат:");
        resultArea = new JTextArea(3, 30);
        resultArea.setEditable(false);

        JButton convertButton = new JButton("Конвертировать");
        convertButton.addActionListener(e -> {
            String word = wordField.getText();
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.substring(i, i + 1);
            }
            resultArea.setText(reversedWord);
        });


        panel.add(wordLabel);
        panel.add(wordField);
        panel.add(convertButton);
        panel.add(resultLabel);
        panel.add(resultArea);

        add(panel);
        setVisible(true);
    }
}