package getinputfromkeyboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK PGRI 2 SUMEDANG
 */
//public class GraphicPanel {
 public class GraphicPanel extends Panel {
 public GraphicPanel() {
 setBackground(Color.white);
 }
 public void paint(Graphics g) {
 g.setColor(new Color(0,255,0)); //green
 g.setFont(new Font("Helvetica",Font.PLAIN,16));
 g.drawString("Rendy Rishandi Perkasa!", 30, 100);
 g.setColor(new Color(1.0f,0,0)); //red
 g.fillRect(30, 100, 150, 10);
 } 
public static void main(String args[]) {
 Frame f = new Frame("Testing Graphics Panel");
 GraphicPanel gp = new GraphicPanel();
 f.add(gp);
 f.setSize(600, 300);
 f.setVisible(true);
 }
 } 
