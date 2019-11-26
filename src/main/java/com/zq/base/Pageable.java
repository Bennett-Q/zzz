package com.zq.base;

/**
 * Created by zhangq on 2019/5/30.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.List;

public interface Pageable<T> extends List<T> {
    int DEFAULT_PAGE_NO = 1;
    int DEFAULT_PAGE_SIZE = 20;
    long DEFAULT_TOTAL = 0L;
    int MAX_PAGE_SIZE = 1000;

    void setTotal(long var1);

    void setPageNo(int var1);

    void setPageSize(int var1);

    int getPageNo();

    int getPageSize();

    long getTotal();

    int getTotalPage();

    boolean hasPrevPage();

    boolean hasNextPage();

    int getFirstPage();

    int getLastPage();

    int getPrevPage();

    int getNextPage();

    int getOffset();

    int getOffsetEnd();
}
