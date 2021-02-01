package com.设计模式.创建型模式.原型模式;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 深度克隆，类的对象属性也是独立备份
 * @class DeepCloneBean
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/8/5 23:47
 * @Version 1.0
 */
@Data
public class DeepCloneBean implements Cloneable {
    private String name;
    private List<CloneBean> list = new ArrayList<>();
    private Map<String,String> map = new HashMap<>();

    @Override
    protected Object clone() {
        try {
            DeepCloneBean deepCloneBean = (DeepCloneBean) super.clone();
            deepCloneBean.setList(new ArrayList<CloneBean>());
            for (CloneBean c : list) {
                deepCloneBean.getList().add((CloneBean) c.clone());
            }
            deepCloneBean.setMap(new HashMap<>());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()){
                String key = it.next();
                deepCloneBean.getMap().put(key,map.get(key));
            }
            return deepCloneBean;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
