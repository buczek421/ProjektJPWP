package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class WinFrame {

    public WinFrame(List lista){

        int punkty = 0;
        String wynik = "";
        int[] tablica = new int[4];
        for(int i = 0; i < lista.size(); i++)                                                                           //spisanie zebranych liczb do tablicy
        {
            tablica[i] = (Integer) lista.get(i);
        }
        if (tablica[0] == 8)punkty++;                                                                                   //przyznanie punktów na podstawie danych z tablicy
        if (tablica[1] == 9)punkty++;
        if (tablica[2] == 6)punkty++;
        if (tablica[3] == 4)punkty++;

        JFrame frame2 = new JFrame("Gratulację!!!");
        JPanel panel = new JPanel(new GridBagLayout());

        if (punkty == 2 || punkty == 3 || punkty == 4){                                                                 //wybranie odpowiedniego komunikatu do wyświetlenia na ekranie gratulacyjnym
            wynik = "Zdobyłeś "+punkty+" punkty na 4";
        }
        else if (punkty == 1){
            wynik = "Zdobyłeś "+punkty+" punkt na 4";
        }
        else if (punkty == 0){
            wynik = "Zdobyłeś "+punkty+" punktów na 4";
        }

        JLabel textLabel = new JLabel(wynik, JLabel.CENTER);
        textLabel.setFont(new Font("Verdana", Font.BOLD, 32));

        JButton menu = new JButton("Menu");
        menu.setFocusable(false);
        menu.setPreferredSize(new Dimension(200,100));
        menu.addActionListener(new ActionListener() {                                                                   //guzik powrotu do menu
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                new Menu();
            }
        });

        panel.add(menu);
        frame2.add(panel,BorderLayout.SOUTH);
        frame2.setBackground(Color.green);
        frame2.add(textLabel, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500,500);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    }
}

class WinFrame2 {

    public WinFrame2(List lista){

        int punkty = 0;
        String wynik = "";
        int[] tablica = new int[7];
        for(int i = 0; i < lista.size(); i++)                                                                           //spisanie zebranych liczb do tablicy
        {
            tablica[i] = (Integer) lista.get(i);
        }
        if (tablica[0] == 9)punkty++;                                                                                   //przyznanie punktów na podstawie danych z tablicy
        if (tablica[1] == 8)punkty++;
        if (tablica[2] == 3)punkty++;
        if (tablica[3] == 7)punkty++;
        if (tablica[4] == 4)punkty++;
        if (tablica[5] == 5)punkty++;
        if (tablica[6] == 6)punkty++;

        JFrame frame2 = new JFrame("Gratulację!!!");
        JPanel panel = new JPanel(new GridBagLayout());

        if (punkty == 1){                                                                                               //wybranie odpowiedniego komunikatu do wyświetlenia na ekranie gratulacyjnym
            wynik = "Zdobyłeś "+punkty+" punkt na 7";
        }
        else if (punkty == 2 || punkty == 3 || punkty == 4){
            wynik = "Zdobyłeś "+punkty+" punkty na 7";
        }
        else {
            wynik = "Zdobyłeś "+punkty+" punktów na 7";
        }

        JLabel textLabel = new JLabel(wynik, JLabel.CENTER);
        textLabel.setFont(new Font("Verdana", Font.BOLD, 32));

        JButton menu = new JButton("Menu");
        menu.setFocusable(false);
        menu.setPreferredSize(new Dimension(200,100));
        menu.addActionListener(new ActionListener() {                                                                   //guzik powrotu do menu
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                new Menu();
            }
        });

        panel.add(menu);
        frame2.add(panel,BorderLayout.SOUTH);

        frame2.setBackground(Color.green);
        frame2.add(textLabel, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500,500);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    }
}

class WinFrame3 {

    public WinFrame3(List lista){

        int punkty = 0;
        String wynik = "";
        int[] tablica = new int[14];
        for(int i = 0; i < lista.size(); i++)                                                                           //spisanie zebranych liczb do tablicy
        {
            tablica[i] = (Integer) lista.get(i);
        }
        if (tablica[0] == 6)punkty++;                                                                                   //przyznanie punktów na podstawie danych z tablicy
        if (tablica[1] == 5)punkty++;
        if (tablica[2] == 3)punkty++;
        if (tablica[3] == 8)punkty++;
        if (tablica[4] == 1)punkty++;
        if (tablica[5] == 8)punkty++;
        if (tablica[6] == 9)punkty++;
        if (tablica[7] == 7)punkty++;
        if (tablica[8] == 6)punkty++;
        if (tablica[9] == 2)punkty++;
        if (tablica[10] == 4)punkty++;
        if (tablica[11] == 6)punkty++;
        if (tablica[12] == 7)punkty++;
        if (tablica[13] == 2)punkty++;

        JFrame frame2 = new JFrame("Gratulację!!!");
        JPanel panel = new JPanel(new GridBagLayout());

        if (punkty == 1){                                                                                               //wybranie odpowiedniego komunikatu do wyświetlenia na ekranie gratulacyjnym
            wynik = "Zdobyłeś "+punkty+" punkt na 7";
        }
        else if (punkty == 2 || punkty == 3 || punkty == 4){
            wynik = "Zdobyłeś "+punkty+" punkty na 7";
        }
        else {
            wynik = "Zdobyłeś "+punkty+" punktów na 7";
        }

        JLabel textLabel = new JLabel(wynik, JLabel.CENTER);
        textLabel.setFont(new Font("Verdana", Font.BOLD, 32));

        JButton menu = new JButton("Menu");
        menu.setFocusable(false);
        menu.setPreferredSize(new Dimension(200,100));
        menu.addActionListener(new ActionListener() {                                                                   //guzik powrotu do menu
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                new Menu();
            }
        });

        panel.add(menu);
        frame2.add(panel,BorderLayout.SOUTH);

        frame2.setBackground(Color.green);
        frame2.add(textLabel, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500,500);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
    }
}

