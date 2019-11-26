package com.zq.base;

/**
 * Created by zhangq on 2019/5/30.
 */

import java.io.Serializable;

public interface PK<E extends Serializable> extends Serializable {
    E getId();

    void setId(E var1);
}
