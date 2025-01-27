/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern19_State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author ZhouYuhang
 * @version SafeFrame.java, v 0.1 2025年01月27日 11:12 ZhouYuhang
 */
public class SafeFrame extends Frame implements ActionListener, Context {

    private TextField textClock = new TextField(60);

    private TextArea textScreen = new TextArea(10, 60);

    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    private State state = DayState.getInstance(); //初始化状态

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        //配置textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        //配置textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        //为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        //配置界面
        add(panel, BorderLayout.SOUTH);
        //显示
        pack();
        show();
        //设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    /**
     * 按钮被按下后该方法会被调用
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    /**
     * 设置时间
     *
     * @param hour
     */
    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record..." + msg + "\n");
    }
}