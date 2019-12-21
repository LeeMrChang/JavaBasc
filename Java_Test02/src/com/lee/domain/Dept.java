package com.lee.domain;

/**
 * @ClassName:dept
 * @Author：Mr.lee
 * @DATE：2019/12/21
 * @TIME： 15:49
 * @Description: TODO
 */
public class Dept {
    private Integer id;
    private String dname;
    private String loc;

    public Dept() {
    }

    public Dept(int id, String dname, String loc) {
        this.id = id;
        this.dname = dname;
        this.loc = loc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
