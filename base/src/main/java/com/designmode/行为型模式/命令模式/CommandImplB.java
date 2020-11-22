package com.designmode.行为型模式.命令模式;

/**
 * @class CommandImpl
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 15:03
 * @Version 1.0
 */
public class CommandImplB implements Command {
    CommandReceiverB commandReceiverb;

    public CommandImplB(CommandReceiverB commandReceiverb) {
        this.commandReceiverb = commandReceiverb;
    }

    @Override
    public void execute() {
        commandReceiverb.taskExecuteCommand();
    }

    @Override
    public void redo() {
        commandReceiverb.taskRedoCommand();
    }

    @Override
    public void undo() {
        commandReceiverb.taskUndoCommand();
    }
}
