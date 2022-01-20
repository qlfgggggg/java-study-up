package com.qiao.liangfang.juc.threadlocal;

public class ThreadT {
    static ThreadLocal<Person> threadLocal = new ThreadLocal<>();
    public static void addPerson(String name,int age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        threadLocal.set(person);
    }

    public static Person getPersion(){
        return threadLocal.get();
    }
}
