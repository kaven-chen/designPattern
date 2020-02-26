package com.chq.design.pattern.structural.composite;

/**
 * 组合模式：
 *  定义：将对象组合成树形结构以表示“部分-整体”的层次结构
 *  组合模式使客户端对单个对象和组合对象保持一致的方式处理
 *      node
 *      /  \
 *  leaf   leaf
 *  适用场景：
 *      希望客户端可以忽略单个和组合对象差异时
 *      处理一个树形结构时
 * 源码解析：
 *  jdk：
 *      HashMap
 *  mybatis: SqlNode
 *
 * 代码场景：
 *  以目录和文件为例：目录下面可以有文件和子目录。子目录下又可以包含文件和子目录
 *      1.定义一个目录和文件共同继承的抽象类或接口
 *      2.
 * @Date 2020/2/25 22:34
 * @Created by ChenQiang
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent catalog1 = new Catalog("目录1",1);

        CatalogComponent catalog2 = new Catalog("目录2",2);


        CatalogComponent file3 = new File("文件a1", 300);
        CatalogComponent file1 = new File("文件b1", 100);
        CatalogComponent file2 = new File("文件b2", 200);

        catalog1.add(catalog2);
        catalog1.add(file3);

        catalog2.add(file1);
        catalog2.add(file2);

        catalog1.print();

    }
}
