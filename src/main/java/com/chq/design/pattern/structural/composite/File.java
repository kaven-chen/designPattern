package com.chq.design.pattern.structural.composite;

/**
 * 文件
 * @Date 2020/2/26 22:15
 * @Created by ChenQiang
 */
public class File extends CatalogComponent {

    private String name;
    private double size; // 文件大小

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("文件：" + name+"文件大小：" + size);
    }
}
