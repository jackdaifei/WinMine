package com.fly.game.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-9-2
 * Time: 下午11:59
 * To change this template use File | Settings | File Templates.
 */
public class WinMineBtn extends JButton implements MouseListener {

    public WinMineBtn() {
        // 设置默认大小为16*16像素
        this.setPreferredSize(new Dimension(16, 16));
        this.setSize(16, 16);
        this.setBackground(new Color(0xc0c0c0));
        this.setBorder(BorderFactory.createRaisedBevelBorder());


        this.addMouseListener(this);
    }


    public void mouseClicked(MouseEvent e) {
        this.setVisible(false);
//        this.getParent().repaint();
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
