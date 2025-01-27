/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern16_Mediator.Impl;

import org.example.design.pattern16_Mediator.Colleague;
import org.example.design.pattern16_Mediator.Mediator;

import java.awt.*;

/**
 * @author ZhouYuhang
 * @version ColleagueButton.java, v 0.1 2025年01月24日 13:19 ZhouYuhang
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    public ColleagueButton(String caption) throws HeadlessException {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}