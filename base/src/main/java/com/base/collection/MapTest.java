package com.base.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @class MapTest
 * @Author Administrator
 * @Description //TODO
 * @Date 2020/3/15 14:42
 * @Version 1.0
 */
public class MapTest {
    static class MyHashMap {
        public void hashMapNew() {
            Map map = new HashMap<>();
        }
    }

    static class Person {
        private int id;

        public Person(int id) {
            this.id = id;
        }

        /*@Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return id == person.id;
        }*/

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {

        Map map = new HashMap<>();
        Person person = new Person(1);
        Person person2 = new Person(1);
        map.put(person2, 1);
        System.out.println(map.containsKey(person2));
    }
}
