/*
 * Ant Group
 * Copyright (c) 2004-2025 All Rights Reserved.
 */
package org.example.design.pattern22_Command.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author 秋涩
 * @version MacroCommand.java, v 0.1 2025年01月30日 21:32 秋涩
 */
public class MacroCommand implements Command {

    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            Command command = it.next();
            command.execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear(){
        commands.clear();
    }
}