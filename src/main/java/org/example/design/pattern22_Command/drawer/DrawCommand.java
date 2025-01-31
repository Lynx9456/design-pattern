/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern22_Command.drawer;

import org.example.design.pattern22_Command.command.Command;

import java.awt.*;

/**
 * @author 秋涩
 * @version DrawCommand.java, v 0.1 2025年01月30日 21:32 秋涩
 */
public class DrawCommand implements Command {

    private Drawable drawable;

    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}