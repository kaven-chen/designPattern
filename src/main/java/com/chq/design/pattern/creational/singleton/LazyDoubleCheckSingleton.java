package com.chq.design.pattern.creational.singleton;

/**
 * @Description 双重锁检查
 * 该版本存在
 * @Date 2019/12/2 21:51
 * @Created by ChenQiang
 */
public class LazyDoubleCheckSingleton {
    /** 一定要加volatile来保证可见性，防止指令重排序 */
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        // 第一重检查为空直接返回，不用经过锁，提升效率
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                // 第二重检查，经过了同步锁，为空时进行初始化
                if (lazyDoubleCheckSingleton == null) {

                    /**
                     * lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                     * 实际上有三个步骤：
                     *      1. 分配内存给这个对象
                     *      2. 初始化对象
                     *      3. 设置 lazyDoubleCheckSingleton 指向刚分配的内存地址
                     *      2和3的顺序有可能会被颠倒，
                     *      这个时候，就规定所有的线程在执行java程序的时候，必须要遵守intra-thread semantics这么一个规定
                     *      它保证了重排序不会改变单线程内的程序执行结果
                     * 解决方案：
                     *      在初始化的时候，给它加上一个volatile关键字：
                     *      这个时候，就可以实现线程安全的延迟初始化，这样的话，重排序就是会被禁止，在多线程的时候，CPU也有共享内存，
                     *      我们加上了这个关键字了之后，所有线程就能看到共享内存的最新状态，保证了内存的可见性，使用volatile的时候，
                     *      在进行写操作的时候，会多出一些汇编代码，起到两个作用1）将当前处理器缓存好的数据写回到系统内存中，
                     *      其他内存从共享内存中同步数据，这样的话，就保证了共享内存的可见性，这里就是使用了缓存一致性的协议，
                     *      当发现缓存内存中的数据无效，会重新从系统内存中把数据读回处理器的内存里;
                     */
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
