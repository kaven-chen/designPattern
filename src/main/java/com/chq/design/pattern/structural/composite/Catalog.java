package com.chq.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 目录
 * @Date 2020/2/26 22:10
 * @Created by ChenQiang
 */
public class Catalog extends CatalogComponent {

    private List<CatalogComponent> catalogComponents = new ArrayList<>();
    private String name;
    private Integer level;

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("目录："+name);
        for (CatalogComponent component : catalogComponents) {
            if (this.level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
            }
            component.print();
        }
    }
}
