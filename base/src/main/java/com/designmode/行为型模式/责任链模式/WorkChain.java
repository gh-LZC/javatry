package com.designmode.行为型模式.责任链模式;

import lombok.Data;

/**
 * @class WorkChain
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/3 14:30
 * @Version 1.0
 */
@Data
abstract public class WorkChain {
        WorkChain nextWorkChai;
        abstract void doChain(Report report);
}