/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern19_State;

/**
 * @author ZhouYuhang
 * @version DayState.java, v 0.1 2025年01月27日 10:52 ZhouYuhang
 */
public class DayState implements State {

    private static DayState singleton = new DayState();

    private DayState() {

    }

    public static State getInstance() {
        return singleton;
    }

    /**
     * 设置时间
     *
     * @param context
     * @param hour
     */
    @Override
    public void doClock(Context context, int hour) {    //设置时间
        if (hour < 9 || hour >= 17) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {                //使用金库
        context.callSecurityCenter("使用金库（白天）");
    }

    @Override
    public void doAlarm(Context context) {              //按下警铃
        context.callSecurityCenter("按下警铃（白天）");
    }

    @Override
    public void doPhone(Context context) {              //正常通话
        context.recordLog("正常通话（白天）");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}