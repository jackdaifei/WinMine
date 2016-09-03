package com.fly.game.model;

import com.fly.game.model.WinMineBtn;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-8-29
 * Time: 下午9:14
 * To change this template use File | Settings | File Templates.
 */
public class WinMineFrame extends JFrame {

    private Container contentPane;

    private JPanel panel;

    private JMenu menu;

    public WinMineFrame(){
        this.setTitle("扫雷");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        contentPane = getContentPane();
        panel = new JPanel(null);
        panel.setBackground(Color.white);

        menu = new JMenu("menu");
        JMenuItem menuItem = new JMenuItem("1");

        menuItem.setPreferredSize(new Dimension(150, 20));
        menu.add(menuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(0xece9d8));

        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        panel.add(new WinMineBtn());

        contentPane.add(panel);

    }

}
