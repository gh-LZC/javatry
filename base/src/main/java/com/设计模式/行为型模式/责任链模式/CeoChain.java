package com.设计模式.行为型模式.责任链模式;

/**
 * @class FirstChain
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/3 21:37
 * @Version 1.0
 */
public class CeoChain extends WorkChain{
    @Override
    void doChain(Report report) {
        report.getMessage().add("Ceo true");
        if(nextWorkChai!=null){
            nextWorkChai.doChain(report);
        }else{
            System.out.println("流程已审批完成。");
        }
    }
}
