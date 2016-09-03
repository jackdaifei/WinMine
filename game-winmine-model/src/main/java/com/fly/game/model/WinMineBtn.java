package com.fly.game.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 16-9-2
 * Time: 下午11:59
 * To change this template use File | Settings | File Templates.
 */
public class WinMineBtn extends JButton implements ActionListener {

    public WinMineBtn() {
        // 设置默认大小为16*16像素
        this.setPreferredSize(new Dimension(16, 16));
        this.setSize(16, 16);
        this.setBackground(new Color(0xc0c0c0));
        this.setBorder(BorderFactory.createRaisedBevelBorder());

        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(111111);
    }
}
