package com.designmode.行为型模式.责任链模式;

import java.util.ArrayList;

/**
 * @class Client
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/3 21:53
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args){
        WorkChain grouperChain = new GrouperChain();
        WorkChain managerChain = new ManagerChain();
        WorkChain cfoChain = new CfoChain();
        WorkChain ceoChain = new CeoChain();
        grouperChain.setNextWorkChai(managerChain);
        managerChain.setNextWorkChai(cfoChain);
        cfoChain.setNextWorkChai(ceoChain);
        Report report = new Report(new ArrayList<>());
        grouperChain.doChain(report);
        System.out.println("审批细节-"+report.getMessage());
    }
}
