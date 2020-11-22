package com.designmode.行为型模式.命令模式;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 15:08
 * @Version 1.0
 */
public class CommandClient {
    public static void main(String[] args){
      CommandInvoker commandInvoker = new CommandInvoker();
      commandInvoker.addCommand(new CommandImplA(new CommandReceiverA()));
      commandInvoker.addCommand(new CommandImplB(new CommandReceiverB()));
      commandInvoker.executeCommand();
      commandInvoker.redoCommand();
      commandInvoker.undoCommand();
    }
}
