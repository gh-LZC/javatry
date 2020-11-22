package com.designmode.结构型模式.过滤器模式;

import java.util.List;

public interface IFilter {
    List<BeFilterObject> filter(List<BeFilterObject> beFilterObjects);
}
