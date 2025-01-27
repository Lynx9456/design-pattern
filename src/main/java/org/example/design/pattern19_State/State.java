/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern19_State;

/**
 * @author ZhouYuhang
 * @version State.java, v 0.1 2025年01月27日 10:50 ZhouYuhang
 */
public interface State {
    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}