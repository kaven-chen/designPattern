package com.chq.design.pattern.structural.flyweight;

import java.util.HashMap;

public class ManagerFactory {


    public final static HashMap<String, Employee> HASH_MAP = new HashMap<>();

    public static Manager getManager(String department) {

        Manager manager = (Manager) HASH_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建" + department + "报告");
            manager.setReportContent(department+"报告");
            HASH_MAP.put(department, manager);
        }
        return manager;

    }

}
