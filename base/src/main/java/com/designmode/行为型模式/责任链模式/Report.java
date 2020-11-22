package com.designmode.行为型模式.责任链模式;

import java.util.List;

/**
 * @class Report 被审批对象
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/3 14:31
 * @Version 1.0
 */
public class Report {
    List<String> message;
    Report(){}
    Report(List<String> message) {
        this.message = message;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }
}
