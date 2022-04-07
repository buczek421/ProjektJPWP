package com.company;
import javax.swing.*;
import java.awt.*;

public class Map extends JFrame {
    static Labirynt1 l1 = new Labirynt1();
    static Labirynt2 l2 = new Labirynt2();
    static Labirynt3 l3 = new Labirynt3();

    public Map(int level){                                                                                              //panele z mapami
        if (level==1){
            JPanel zawartosc = new JPanel();
            zawartosc.setLayout(new BorderLayout());
            RysujObszar1 obszar = new RysujObszar1(500, 500);
            setContentPane(zawartosc);
            zawartosc.add(obszar);

        }

        if (level==2) {
            JPanel zawartosc = new JPanel();
            zawartosc.setLayout(new BorderLayout());
            RysujObszar2 obszar = new RysujObszar2(500, 500);
            setContentPane(zawartosc);
            zawartosc.add(obszar);
        }

        if (level==3) {
            JPanel zawartosc = new JPanel();
            zawartosc.setLayout(new BorderLayout());
            RysujObszar3 obszar = new RysujObszar3(500, 500);
            setContentPane(zawartosc);
            zawartosc.add(obszar);
        }

    }

    public int get1(int x, int y){                                                                                      //pobranie (get) i ustawienie (set) wartości z mapy
        return l1.mapa1[x][y];
    }

    public void set1(int x, int y, int value){
        l1.mapa1[x][y] = value;
        repaint();
    }

    public int get2(int x, int y){
        return l2.mapa2[x][y];
    }

    public void set2(int x, int y, int value){
        l2.mapa2[x][y] = value;
        repaint();
    }

    public int get3(int x, int y){
        return l3.mapa3[x][y];
    }

    public void set3(int x, int y, int value){
        l3.mapa3[x][y] = value;
        repaint();
    }

    class RysujObszar1 extends JPanel{                                                                                  //rysowanie obszsaru mapy
        public RysujObszar1(int szerokosc, int wysokosc)
        {
            this.setPreferredSize(new Dimension(szerokosc,wysokosc));
        }
        public void paintComponent(Graphics g)
        {
            l1.rysuj(g);
        }
    }
    class RysujObszar2 extends JPanel{
        public RysujObszar2(int szerokosc, int wysokosc)
        {
            this.setPreferredSize(new Dimension(szerokosc,wysokosc));
        }
        public void paintComponent(Graphics g)
        {
            l2.rysuj(g);
        }
    }
    class RysujObszar3 extends JPanel{
        public RysujObszar3(int szerokosc, int wysokosc)
        {
            this.setPreferredSize(new Dimension(szerokosc,wysokosc));
        }
        public void paintComponent(Graphics g)
        {
            l3.rysuj(g);
        }
    }
}
class Labirynt1 {
    public int mapa1[][];

    public Labirynt1(){
        int[][] l =
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},                                                    //obszar mapy
                        {1,4,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1},
                        {1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1},
                        {1,0,1,0,0,6,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1},
                        {1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,5,1},
                        {1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1},
                        {1,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1},
                        {1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1},
                        {1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1},
                        {1,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1},
                        {1,7,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1},
                        {1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1},
                        {1,0,1,0,1,8,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1},
                        {1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1},
                        {1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,3,1,0,1},
                        {1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1},
                        {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                };
        mapa1 = l;
    }


    public void rysuj(Graphics g) {                                                                                     //rysowanie mapy graficznie
        for (int r = 0; r < mapa1.length; r++)
            for (int k = 0; k < mapa1[0].length; k++) {
                if (mapa1[r][k] == 1){
                    g.setColor(Color.BLACK);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if (mapa1[r][k] == 0){
                    g.setColor(Color.WHITE);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if (mapa1[r][k] == 3){
                    g.setColor(Color.YELLOW);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if(mapa1[r][k] == 4){
                    g.setColor(Color.blue);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if(mapa1[r][k] == 8){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString(String.valueOf(9),105,315);}
                else if(mapa1[r][k] == 5){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString(String.valueOf(4),385,115);}
                else if(mapa1[r][k] == 6){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString(String.valueOf(6),105,75);}
                else if(mapa1[r][k] == 7){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString(String.valueOf(8),25,275);}
            }
    }

}
class Labirynt2 {
    public int mapa2[][];

    public Labirynt2() {
        int[][] l =
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},                                //obszar mapy
                        {1,4,1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1},
                        {1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1},
                        {1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,1,0,1,10,1,0,1},
                        {1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
                        {1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1},
                        {1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1},
                        {1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,1},
                        {1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1},
                        {1,0,1,0,0,0,0,0,1,0,1,0,1,0,1,5,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1},
                        {1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1},
                        {1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1},
                        {1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1},
                        {1,0,0,0,1,0,1,0,1,9,1,0,0,0,1,0,0,0,1,3,1,0,0,0,1,0,1,0,0,0,1},
                        {1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1},
                        {1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,6,1,0,0,0,1,0,1,0,1,0,1,0,1,0,1},
                        {1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1},
                        {1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1},
                        {1,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,8,0,0,1},
                        {1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1},
                        {1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1},
                        {1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1},
                        {1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,1},
                        {1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1},
                        {1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1},
                        {1,0,0,0,1,7,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1},
                        {1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1},
                        {1,0,0,0,0,0,0,0,0,0,1,0,0,0,1,11,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}

                };

        mapa2 = l;
    }

    public void rysuj(Graphics g) {                                                                                     //rysowanie mapy graficznie
        for (int r = 0; r < mapa2.length; r++)
            for (int k = 0; k < mapa2[0].length; k++) {
                if (mapa2[r][k] == 1){
                    g.setColor(Color.BLACK);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if (mapa2[r][k] == 0){
                    g.setColor(Color.WHITE);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if (mapa2[r][k] == 3){
                    g.setColor(Color.YELLOW);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if(mapa2[r][k] == 4){
                    g.setColor(Color.blue);
                    g.fillRect(k * 20, r * 20, 20, 20);}
                else if(mapa2[r][k] == 5){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("3",305,195);}
                else if(mapa2[r][k] == 6){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("4",305,315);}
                else if(mapa2[r][k] == 9){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("7",185,275);}
                else if(mapa2[r][k] == 10){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("8",545,75);}
                else if(mapa2[r][k] == 8){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("6",545,395);}
                else if(mapa2[r][k] == 7){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("5",105,555);}
                else if(mapa2[r][k] == 11){
                    g.setFont(new Font("Verdana", Font.BOLD,16));
                    g.setColor(Color.red);
                    g.drawString("9",305,595);}
            }
    }
}

class Labirynt3 {
    public int mapa3[][];

    public Labirynt3(){
        int [][] l=
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},            //obszsar mapy
                        {1,4,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1},
                        {1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,1,16,1,0,1},
                        {1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1},
                        {1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,13,0,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1},
                        {1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,0,1,0,1},
                        {1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,9,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1},
                        {1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1},
                        {1,0,1,0,0,0,0,0,0,0,1,0,1,8,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1},
                        {1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1},
                        {1,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,1},
                        {1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1},
                        {1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1},
                        {1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1},
                        {1,0,0,0,1,0,0,0,1,14,1,0,1,0,1,0,0,0,1,10,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,0,0,1},
                        {1,1,1,0,1,0,1,1,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1},
                        {1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1},
                        {1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1},
                        {1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1},
                        {1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,1,7,1,0,1},
                        {1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1},
                        {1,0,1,5,1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,6,1,0,1,0,0,0,0,0,1},
                        {1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1},
                        {1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1},
                        {1,18,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1},
                        {1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1},
                        {1,0,0,0,1,0,0,0,1,11,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,0,0,1},
                        {1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1},
                        {1,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1},
                        {1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1},
                        {1,0,1,0,1,0,1,0,0,0,1,17,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1},
                        {1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1},
                        {1,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1},
                        {1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1},
                        {1,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,1,12,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1},
                        {1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,3,1,0,0,0,0,15,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                };
        mapa3=l;
    }

    public void rysuj(Graphics g) {                                                                                     //rysowanie mapy graficznie
        for (int r = 0; r < mapa3.length; r++)
            for (int k = 0; k < mapa3[0].length; k++) {
                if (mapa3[r][k] == 1){
                    g.setColor(Color.BLACK);
                    g.fillRect(k * 15, r * 15, 15, 15);}
                else if (mapa3[r][k] == 0){
                    g.setColor(Color.WHITE);
                    g.fillRect(k * 15, r * 15, 15, 15);}
                else if (mapa3[r][k] == 3){
                    g.setColor(Color.YELLOW);
                    g.fillRect(k * 15, r * 15, 15, 15);}
                else if (mapa3[r][k] == 4){
                    g.setColor(Color.blue);
                    g.fillRect(k * 15, r * 15, 15, 15);}
                else if (mapa3[r][k] == 6){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("2",468,358);}
                else if (mapa3[r][k] == 18){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("2",18,418);}
                else if (mapa3[r][k] == 5){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("1",48,358);}
                else if (mapa3[r][k] == 7){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("3",558,328);}
                else if (mapa3[r][k] == 8){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("4",198,148);}
                else if (mapa3[r][k] == 9){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("5",378,118);}
                else if (mapa3[r][k] == 10){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("6",288,238);}
                else if (mapa3[r][k] == 16){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("6",558,58);}
                else if (mapa3[r][k] == 17){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("6",168,508);}
                else if (mapa3[r][k] == 11){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("7",138,448);}
                else if (mapa3[r][k] == 15){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("7",588,598);}
                else if (mapa3[r][k] == 12){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("8",258,568);}
                else if (mapa3[r][k] == 14){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("8",138,238);}
                else if (mapa3[r][k] == 13){
                    g.setFont(new Font("Verdana", Font.BOLD,14));
                    g.setColor(Color.red);
                    g.drawString("9",318,88);
                }

            }
    }
}