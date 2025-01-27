/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern16_Mediator;

/**
 * @author ZhouYuhang
 * @version Colleague.java, v 0.1 2025年01月24日 13:18 ZhouYuhang
 */
public interface Colleague {
    void setMediator(Mediator mediator);
    void setColleagueEnabled(boolean enabled);
}