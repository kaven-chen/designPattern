package com.chq.design.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * 经理类
 */
public class Manager implements Employee {


    private final static HashMap<String, Manager> HASH_MAP = new HashMap<>();

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    /**
     * 经理做报告
     */
    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
