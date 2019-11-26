package com.zq.base;

/**
 * Created by zhangq on 2019/5/30.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.Serializable;

public interface BasicDao<T extends PK<ID>, ID extends Serializable> {
    T getById(ID var1);

    int delete(T var1);

    int insert(T var1);

    int update(T var1);
}
