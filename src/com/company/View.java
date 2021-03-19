package com.company;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.text.AbstractDocument;
import javax.swing.text.StyledDocument;
import javax.swing.text.DocumentFilter;

public class View extends JFrame
{
    public View (Controller controller)
    {
        this.controller = controller;
        setLayout (new FlowLayout());

        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("file");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener((ActionEvent e) -> System.exit(0));

        menuBar.add(fileMenu);
        fileMenu.add(quitItem);
        setJMenuBar(menuBar);

        textField = new JTextField(10);
        add(textField);
        progressBar = new JProgressBar(0, 10);
        add(progressBar);
        textField.addActionListener((ActionEvent e) ->
        {
            int x = textField.getText().length(); progressBar.setValue(x);
        });

        setSize(500,400);
        setVisible(true);
    }
    private Controller controller;
    private JMenuBar menuBar;
    private JTextField textField;
    private JProgressBar progressBar;
}
