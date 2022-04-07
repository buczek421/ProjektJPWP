package com.company;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu {                                                                                                     //menu główne

    JFrame frame = new JFrame("Maze");

    public Menu(){

        JPanel panel = new JPanel();                                                                                    //okno z menu głównym
        panel.setLayout(null);
        panel.setBounds(0,0,500,500);
        JButton play = new JButton("Graj");
        JLabel tlo = new JLabel(new ImageIcon("src/com/company/data/images/menu.png"));
        tlo.setBounds(0,0,500,500);
        JButton exit = new JButton("Wyjdź");
        JButton instruction = new JButton("Instrukcja");

        play.setFont(new Font("Verdana", Font.BOLD, 28));
        exit.setFont(new Font("Verdana", Font.BOLD, 28));
        instruction.setFont(new Font("Verdana", Font.BOLD, 28));
        play.setBounds(100,150,300,90);
        instruction.setBounds(100,250,300,90);
        exit.setBounds(100,350,300,90);

        panel.add(play);
        panel.add(instruction);
        panel.add(exit);
        panel.add(tlo);

        frame.add(panel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        play.addActionListener(new ActionListener()                                                                     //działanie przycisku graj
        {
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                new Difficulty();
            }
        });

        instruction.addActionListener(new ActionListener()                                                              //działanie przycisku insstrukcja
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame instruction = new JFrame("Instrukcja");
                JPanel instruction_p = new JPanel();
                instruction_p.setLayout(null);
                panel.setBounds(0,0,540,500);
                JLabel instructions = new JLabel(new ImageIcon("src/com/company/data/images/instrukcja.png"));
                instructions.setBounds(0,-25,530,500);
                instruction_p.add(instructions);
                instruction.add(instruction_p);
                instruction.setSize(540,500);
                instruction.setLocationRelativeTo(null);
                instruction.setResizable(false);
                instruction.setVisible(true);
            }
        });

        exit.addActionListener(new ActionListener()                                                                     //działanie przycisku wyjdź
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

    }
}
