package com.company;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Difficulty {

    public Difficulty(){

        final JFrame frame = new JFrame("Menu");
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);

        Button easy = new Button("Łatwy");                                                                         //utworzenie guzików
        easy.setFont(new Font("Verdana", Font.BOLD, 32));

        Button medium = new Button("Średni");
        medium.setFont(new Font("Verdana", Font.BOLD, 32));

        Button hard = new Button("Trudny");
        hard.setFont(new Font("Verdana", Font.BOLD, 32));

        frame.add(easy);
        frame.add(medium);
        frame.add(hard);

        frame.setLayout(boxLayout);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        easy.addActionListener(new ActionListener()                                                                     //działanie guzika łatwy
        {
            public void actionPerformed(ActionEvent ae)
            {
                frame.dispose();
                int easy = 1;
                new MazeFrame(easy);
            }
        });

        medium.addActionListener(new ActionListener()                                                                   //działanie guzika średni
        {
            public void actionPerformed(ActionEvent ae)
            {
                frame.dispose();
                int medium = 2;
                new MazeFrame(medium);

            }
        });

        hard.addActionListener(new ActionListener()                                                                     //działanie guzika trudny
        {
            public void actionPerformed(ActionEvent ae)
            {
                frame.dispose();
                int hard = 3;
                new MazeFrame(hard);
            }
        });
    }
}
