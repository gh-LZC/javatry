package com.设计模式.行为型模式.命令模式;

/**
 * @class CommandReceiver
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/12 15:03
 * @Version 1.0
 */
public class CommandReceiverB {
    public void taskExecuteCommand(){
        System.out.println("B收到执行指令 执行什么！");
    }

    public void taskRedoCommand(){
        System.out.println("B收到重做指令 执行什么的重做！");
    }

    public void taskUndoCommand(){
        System.out.println("B收到撤销指令 执行什么的撤销！");
    }
}
