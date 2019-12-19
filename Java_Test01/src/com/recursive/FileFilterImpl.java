package com.recursive;

import java.io.File;
import java.io.FileFilter;

/**
 * @ClassName:FileFilterImpl
 * @Author：Mr.lee
 * @DATE：2019/12/14
 * @TIME： 11:18
 * @Description: TODO
 */
public class FileFilterImpl implements FileFilter {
    /**
     * 文件过滤器
     * Tests whether or not the specified abstract pathname should be
     * included in a pathname list.
     *
     * @param pathname The abstract pathname to be tested
     * @return <code>true</code> if and only if <code>pathname</code>
     * should be included
     */
    @Override
    public boolean accept(File pathname) {
        //如果是文件夹
        if(pathname.isDirectory()){
            RecursiveTest05.getAllFiles(pathname);
        }
        //过滤
        return pathname.toString().toLowerCase().endsWith(".java");
    }
}
