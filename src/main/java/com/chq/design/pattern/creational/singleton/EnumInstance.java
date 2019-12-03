package com.chq.design.pattern.creational.singleton;

/**
 * 枚举单例模式
 * 可以防止反序列化破坏和反射攻击
 *
 * 详情看 EnumInstance反编译后代码
 * @Date 2019/12/2 23:24
 * @Created by ChenQiang
 */
public enum EnumInstance {
    INSTANCE {
        protected void enumMethodTest() {
            System.out.println("enumMethodTest ...");
        }
    },;

    protected abstract void enumMethodTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
