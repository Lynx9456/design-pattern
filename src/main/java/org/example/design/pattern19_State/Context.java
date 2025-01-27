/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern19_State;


/**
 * @author ZhouYuhang
 * @version Context.java, v 0.1 2025年01月27日 10:50 ZhouYuhang
 */
public interface Context {
    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}