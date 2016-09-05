package com.fly.game.model;

import org.apache.commons.lang.StringUtils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by wintech on 2016/9/5.
 */
public class WinMineLabel extends JLabel {

    public WinMineLabel() {

        this.setSize(16, 16);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("楷体", Font.BOLD, 15));
    }

    public WinMineLabel(String text) {
        this();
        this.setText(text);
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        if (StringUtils.isNotBlank(text)) {
            if ("*".equals(text)) {

            } else if ("1".equals(text)) {
                this.setForeground(new Color(0x0000ff));
            } else if ("2".equals(text)) {
                this.setForeground(new Color(0x008000));
            } else if ("3".equals(text)) {
                this.setForeground(new Color(0xff0000));
            } else if ("4".equals(text)) {
                this.setForeground(new Color(0x000080));
            } else if ("5".equals(text)) {
                this.setForeground(new Color(0x800000));
            } else if ("6".equals(text)) {
                this.setForeground(new Color(0x008080));
            } else if ("7".equals(text)) {
                this.setForeground(new Color(0x000000));
            } else if ("8".equals(text)) {
                this.setForeground(new Color(0x808080));
            }
        }
    }
}
