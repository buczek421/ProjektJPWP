package com.company;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.List;


public class Player extends JPanel implements ActionListener{

    private int x=0;
    private int y=0;
    public List<Integer> liczby = new ArrayList<Integer>();

    private final Map map;

    public Player(Map map){
        this.map = map;
        x = 1;
        y = 1;
    }

    public void actionPerformed(ActionEvent e){
        repaint();
    }

    public void left(Map map){                                                                                          //ruch w lewo
        if(map.get1(x, y-1) != 1){
            map.set1(x, y, 0);
            if(map.get1(x, y-=1) == 3)Win();
            else if(map.get1(x,y) == 8)liczby.add(9);
            else map.set1(x, y, 4);
        }
    }

    public void right(Map map){                                                                                         //ruch w prawo
        if(map.get1(x, y+1) != 1){
            map.set1(x, y, 0);
            if(map.get1(x, y+=1) == 3)Win();
            else if(map.get1(x,y) == 6)liczby.add(6);
            else map.set1(x, y, 4);
        }
    }

    public void up(Map map){                                                                                            //ruch w górę
        if(map.get1(x-1, y) != 1){
            map.set1(x, y, 0);
            if(map.get1(x-=1, y) == 3)Win();
            else if(map.get1(x,y) == 7)liczby.add(8);
            else map.set1(x, y, 4);
        }
    }

    public void down(Map map){                                                                                          //ruch w dół
        if(map.get1(x+1, y) != 1){
            map.set1(x, y, 0);
            if(map.get1(x+=1, y) == 3)Win();
            else if(map.get1(x,y) == 5)liczby.add(4);
            else map.set1(x, y, 4);
        }
    }

    public void Win(){                                                                                                  //wykonanie po dotarciu do mety
        new WinFrame(liczby);
        map.dispose();
    }

}

class Player2 extends JPanel implements ActionListener{

    private int x=0;
    private int y=0;
    List<Integer> liczby = new ArrayList<Integer>();

    private final Map map;

    public Player2(Map map){
        this.map = map;
        x = 1;
        y = 1;
    }

    public void actionPerformed(ActionEvent e){
        repaint();
    }

    public void left(Map map){                                                                                          //ruch w lewo
        if(map.get2(x, y-1) != 1){
            map.set2(x, y, 0);
            if(map.get2(x, y-=1) == 3)Win();
            else if(map.get2(x,y) == 7)liczby.add(5);
            else if(map.get2(x,y) == 8)liczby.add(6);
            else if(map.get2(x,y) == 11)liczby.add(9);
            else map.set2(x, y, 4);
        }
    }

    public void right(Map map){                                                                                         //ruch w prawo
        if(map.get2(x, y+1) != 1){
            map.set2(x, y, 0);
            if(map.get2(x, y+=1) == 3)Win();
            else map.set2(x, y, 4);
        }
    }

    public void up(Map map){                                                                                            //ruch w górę
        if(map.get2(x-1, y) != 1){
            map.set2(x, y, 0);
            if(map.get2(x-=1, y) == 3)Win();
            else if(map.get2(x,y) == 6)liczby.add(4);
            else if(map.get2(x,y) == 9)liczby.add(7);
            else if(map.get2(x,y) == 10)liczby.add(8);
            else map.set2(x, y, 4);
        }
    }

    public void down(Map map){                                                                                          //ruch w dół
        if(map.get2(x+1, y) != 1){
            map.set2(x, y, 0);
            if(map.get2(x+=1, y) == 3) Win();
            else if(map.get2(x,y) == 5)liczby.add(3);
            else map.set2(x, y, 4);
        }
    }

    public void Win(){                                                                                                  //wykonanie funkcji po dotarciu do mety
        new WinFrame2(liczby);
        map.dispose();
    }
}

class Player3 extends JPanel implements ActionListener{

    private int x=0;
    private int y=0;
    List<Integer> liczby = new ArrayList<Integer>();

    private final Map map;

    public Player3(Map map){
        this.map = map;
        x = 1;
        y = 1;
    }

    public void actionPerformed(ActionEvent e){
        repaint();
    }

    public void left(Map map){                                                                                          //ruch w lewo
        if(map.get3(x, y-1) != 1){
            map.set3(x, y, 0);
            if(map.get3(x, y-=1) == 3)Win();
            else if(map.get3(x,y) == 10)liczby.add(6);
            else if(map.get3(x,y) == 13)liczby.add(9);
            else if(map.get3(x,y) == 18)liczby.add(2);
            else map.set3(x, y, 4);
        }
    }

    public void right(Map map){                                                                                         //ruch w prawo
        if(map.get3(x, y+1) != 1){
            map.set3(x, y, 0);
            if(map.get3(x, y+=1) == 3)Win();
            else if(map.get3(x,y) == 6)liczby.add(2);
            else if(map.get3(x,y) == 15)liczby.add(7);
            else map.set3(x, y, 4);
        }
    }

    public void up(Map map){                                                                                            //ruch w górę
        if(map.get3(x-1, y) != 1){
            map.set3(x, y, 0);
            if(map.get3(x-=1, y) == 3)Win();
            else if(map.get3(x,y) == 5)liczby.add(1);
            else if(map.get3(x,y) == 9)liczby.add(5);
            else if(map.get3(x,y) == 12)liczby.add(8);
            else if(map.get3(x,y) == 14)liczby.add(8);
            else map.set3(x, y, 4);
        }
    }

    public void down(Map map){                                                                                          //ruch w dół
        if(map.get3(x+1, y) != 1){
            map.set3(x, y, 0);
            if(map.get3(x+=1, y) == 3) Win();
            else if(map.get3(x,y) == 7)liczby.add(3);
            else if(map.get3(x,y) == 8)liczby.add(4);
            else if(map.get3(x,y) == 11)liczby.add(7);
            else if(map.get3(x,y) == 16)liczby.add(6);
            else if(map.get3(x,y) == 17)liczby.add(6);
            else map.set3(x, y, 4);
        }
    }

    public void Win(){                                                                                                  //wykonanie funkcji po dotarciu do mety
        new WinFrame3(liczby);
        map.dispose();
    }
}