package com.fly.game.model;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wintech on 2016/9/5.
 */
public class WinMinePanel extends JPanel {

    public WinMinePanel() {

        this.setSize(400, 300);
        this.setLayout(null);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i=1;i<5;i++) {
            g.drawLine(0, 16*i, 300, 16*i); // ºáÏß
            g.drawLine(16*i, 0, 16*i, 400); // ÊúÏß
        }
        g.setColor(Color.RED);
//        g.drawRect(64, 64, 16, 16);
        g.fillRect(64, 64, 16, 16);

    }
}
