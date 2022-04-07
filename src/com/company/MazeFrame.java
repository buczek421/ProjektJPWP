package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MazeFrame {

    public MazeFrame(int level){

        if (level==1) {                                                                                                 //utworzenie poziomu łatwego
            final Map mapa = new Map(level);
            final Player player = new Player(mapa);
            JPanel guzik = new JPanel(new GridBagLayout());
            JPanel panel_rownan = new JPanel(new FlowLayout());
            JLabel rownania_tekst = new JLabel("<html>7 x ... = 56 <br/>81 : 9 = ... <br/>... + 67 = 73 " +
                    "<br/> 25 - ... = 21</html>");
            rownania_tekst.setFont(new Font("Verdana",Font.BOLD,22));
            JButton menu = new JButton("Menu");
            menu.setFocusable(false);
            menu.setPreferredSize(new Dimension(300,100));

            menu.addActionListener(new ActionListener() {                                                               //guzik menu działanie
                public void actionPerformed(ActionEvent e) {
                    mapa.dispose();
                    new Menu();
                }
            });

            mapa.addKeyListener(new KeyAdapter()
            {
                public void keyPressed(KeyEvent e){
                    int klawisz = e.getKeyCode();
                    if(e.getKeyChar() == 'a' || klawisz == KeyEvent.VK_LEFT) player.left(mapa);
                    if(e.getKeyChar() == 'd' || klawisz == KeyEvent.VK_RIGHT) player.right(mapa);
                    if(e.getKeyChar() == 'w' || klawisz == KeyEvent.VK_UP) player.up(mapa);
                    if(e.getKeyChar() == 's' || klawisz == KeyEvent.VK_DOWN) player.down(mapa);
                }
            });

            panel_rownan.add(rownania_tekst);
            guzik.add(menu);
            mapa.add(panel_rownan,BorderLayout.EAST);
            mapa.add(guzik,BorderLayout.SOUTH);
            mapa.getContentPane();
            mapa.setTitle("Poziom łatwy");
            mapa.setSize(700, 600);
            mapa.setLocationRelativeTo(null);
            mapa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mapa.setResizable(false);
            mapa.setBackground(Color.white);
            mapa.setVisible(true);
        }

        if (level==2){                                                                                                  //utworzenie poziomu średniego
            final Map mapa = new Map(level);
            final Player2 player = new Player2(mapa);
            JPanel guzik = new JPanel(new GridBagLayout());
            JPanel panel_rownan = new JPanel(new FlowLayout());
            JLabel rownania_tekst = new JLabel("<html>72 : ... = 8<br/>... x 3 = 24<br/>21 : 7 = ...<br/>" +
                    "4 + ... = 11<br/>36 - ... = 32<br/>2 - ... = -3<br/>6 x ... = 36</html>");
            rownania_tekst.setFont(new Font("Verdana",Font.BOLD,22));
            JButton menu = new JButton("Menu");
            menu.setFocusable(false);
            menu.setPreferredSize(new Dimension(300,100));

            menu.addActionListener(new ActionListener() {                                                               //guzik menu działanie
                public void actionPerformed(ActionEvent e) {
                    mapa.dispose();
                    new Menu();
                }
            });

            mapa.addKeyListener(new KeyAdapter()
            {
                public void keyPressed(KeyEvent e){
                    int klawisz = e.getKeyCode();
                    if(e.getKeyChar() == 'a' || klawisz == KeyEvent.VK_LEFT) player.left(mapa);
                    if(e.getKeyChar() == 'd' || klawisz == KeyEvent.VK_RIGHT) player.right(mapa);
                    if(e.getKeyChar() == 'w' || klawisz == KeyEvent.VK_UP) player.up(mapa);
                    if(e.getKeyChar() == 's' || klawisz == KeyEvent.VK_DOWN) player.down(mapa);
                }
            });

            panel_rownan.add(rownania_tekst);
            guzik.add(menu);
            mapa.add(panel_rownan,BorderLayout.EAST);
            mapa.add(guzik,BorderLayout.SOUTH);
            mapa.setTitle("Poziom średni");
            mapa.setSize(900, 800);
            mapa.setLocationRelativeTo(null);
            mapa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mapa.setResizable(false);
            mapa.setBackground(Color.white);
            mapa.setVisible(true);
        }

        if (level==3){                                                                                                  //utworzenie poziomu trudnego
            final Map mapa = new Map(level);
            final Player3 player = new Player3(mapa);
            JPanel panel = new JPanel(new GridBagLayout());
            JPanel panel_rownan = new JPanel(new FlowLayout());
            JLabel rownania_tekst = new JLabel("<html>60 : 10 = ...<br/>5 x ... = 25<br/>18 - ... = 15<br/>" +
                    "10 - 2 = ...<br/>... + 72 = 73<br/>2 x 4 = ...<br/>1 - ... = -8<br/>7 x ... = 49<br/>" +
                    "54 : 9 = ...<br/>10 + ... = 12<br/>... x 8 = 32<br/>4 - ... = -2<br/>88 + ... = 95" +
                    "<br/>72 : ... = 36</html>");
            rownania_tekst.setFont(new Font("Verdana",Font.BOLD,22));
            JButton menu = new JButton("Menu");
            menu.setFocusable(false);
            menu.setPreferredSize(new Dimension(300,100));

            menu.addActionListener(new ActionListener() {                                                               //guzik menu działanie
                public void actionPerformed(ActionEvent e) {
                    mapa.dispose();
                    new Menu();
                }
            });

            mapa.addKeyListener(new KeyAdapter()
            {
                public void keyPressed(KeyEvent e){
                    int klawisz = e.getKeyCode();
                    if(e.getKeyChar() == 'a' || klawisz == KeyEvent.VK_LEFT) player.left(mapa);
                    if(e.getKeyChar() == 'd' || klawisz == KeyEvent.VK_RIGHT) player.right(mapa);
                    if(e.getKeyChar() == 'w' || klawisz == KeyEvent.VK_UP) player.up(mapa);
                    if(e.getKeyChar() == 's' || klawisz == KeyEvent.VK_DOWN) player.down(mapa);
                }
            });

            panel_rownan.add(rownania_tekst);
            panel.add(menu);
            mapa.add(panel_rownan,BorderLayout.EAST);
            mapa.add(panel,BorderLayout.SOUTH);
            mapa.setTitle("Poziom trudny");
            mapa.setSize(900, 800);
            mapa.setLocationRelativeTo(null);
            mapa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mapa.setResizable(false);
            mapa.setBackground(Color.white);
            mapa.setVisible(true);
        }
        }


}
