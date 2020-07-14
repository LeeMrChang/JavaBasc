package com.lee.poi;

import java.util.ArrayList;
import java.util.List;

public class PoiTest {

    public static void main(String[] args) {
        // 创建Excel表格
        createExcel(getStudent());

        // 读取Excel表格
//        List<Student> list = readExcel();
//        System.out.println(list.toString());
    }

    /**
     * 创建Execl
     * @param student
     */
    private static void createExcel(List<Student> student) {
        /*// 创建一个Excel文件
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 创建一个工作表
        HSSFSheet sheet = workbook.createSheet("学生表一");
        // 添加表头行
        HSSFRow hssfRow = sheet.createRow(0);*/
    }

    /**
     * 初始化数据
     *
     * @return 数据
     */
    private static List<Student> getStudent() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("小明", 8, "二年级");
        Student student2 = new Student("小光", 9, "三年级");
        Student student3 = new Student("小花", 10, "四年级");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        return list;
    }


}
