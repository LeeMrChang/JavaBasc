package com.lee.domain;

import java.util.List;

/**
 * @ClassName:PageBean
 * @Author：Mr.lee
 * @DATE：2020/01/13
 * @TIME： 14:18
 * @Description: TODO
 */
public class PageBean<T> {
    /**
     * 存放实体的集合类，也是每页要展示的数据
     */
    private List<T> bean;
    /**
     * 当前页
     */
    private int currentPage;
    /**
     * 每页显示的条数
     */
    private int pageSize;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 总条数
     */
    private int totalCount;

    public List<T> getBean() {
        return bean;
    }

    public void setBean(List<T> bean) {
        this.bean = bean;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "bean=" + bean +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", totalCount=" + totalCount +
                '}';
    }
}
