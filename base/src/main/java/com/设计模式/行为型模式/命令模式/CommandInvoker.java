package com.设计模式.行为型模式.命令模式;

import java.util.LinkedList;
import java.util.List;

/**
 * @class CommandInvoker
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 15:05
 * @Version 1.0
 */
public class CommandInvoker {
    private List<Command> commands = new LinkedList<>();
    public void addCommand(Command command){
        commands.add(command);
    }

    public void executeCommand(){
        for (Command command:commands){
            command.execute();
        }
    }

    public void redoCommand(){
        for (Command command:commands){
            command.redo();
        }
    }

    public void undoCommand(){
        for (Command command:commands){
            command.undo();
        }
    }

}
