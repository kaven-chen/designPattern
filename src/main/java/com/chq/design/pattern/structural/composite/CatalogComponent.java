package com.chq.design.pattern.structural.composite;

/**
 * @Description
 * @Date 2020/2/26 22:00
 * @Created by ChenQiang
 */
public abstract class CatalogComponent {

    /**
     * 这里给出默认实现，让子类自己去重写
     * @param catalogComponent
     */
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
