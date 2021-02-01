package com.设计模式.行为型模式.命令模式;

/**
 * @class CommandImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 15:03
 * @Version 1.0
 */
public class CommandImplA implements Command {
    CommandReceiverA commandReceivera;

    public CommandImplA(CommandReceiverA commandReceivera) {
        this.commandReceivera = commandReceivera;
    }

    @Override
    public void execute() {
        commandReceivera.ataskExecuteCommand();
    }

    @Override
    public void redo() {
        commandReceivera.taskRedoCommand();
    }

    @Override
    public void undo() {
        commandReceivera.taskUndoCommand();
    }
}
