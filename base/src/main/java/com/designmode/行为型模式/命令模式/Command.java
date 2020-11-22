package com.designmode.行为型模式.命令模式;

public interface Command {
    void execute();
    void undo();
    void redo();
}
