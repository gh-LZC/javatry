package com.设计模式.结构型模式.过滤器模式;

import java.util.List;

public interface IFilter {
    List<BeFilterObject> filter(List<BeFilterObject> beFilterObjects);
}
