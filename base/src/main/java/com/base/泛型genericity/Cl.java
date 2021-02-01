package com.base.泛型genericity;

import java.lang.reflect.Field;

/**
 * @class Class
 * @Author Administrator
 * @Description //TODO
 * @Date 2021/1/9 18:44
 * @Version 1.0
 */
public class Cl<I> {
    Dpt do1(I i) throws IllegalAccessException {
        Class c = i.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            if("id".equals(field.getName())){
                Object ob = field.get(i);
                Service service = new Service();
               return service.deal(ob.toString());
            }
        }
        return null;
    }
}
