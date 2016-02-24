package gui;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Prog613 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Frame613 f = new Frame613();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }

}

class Frame613 extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public Frame613() {
    setTitle("613 rocks!");
    setSize(300, 230);
    setLocation(100, 200);

    Panel613 panel = new Panel613();
    Container cp = getContentPane();
    cp.add(panel);
  }
}

class Panel613 extends JPanel {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawString("Hi! What Happend?", 75, 100);
  }
}