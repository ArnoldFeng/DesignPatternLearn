package com.fengtao.behaviorPattern.StrategyPattern.firstVersion;

import java.io.File;

public class Sorter {
    public void sortFile(String filePath) {
        File file  = new File(filePath);
        long fileSize = file.length();
        if (fileSize < 10000){
            quickSort(filePath);
        }else if (fileSize < 1000000) {
            externalSort(filePath);
        }
    }

    private void quickSort(String filePath){
        //快排
    }

    private void externalSort(String filePath) {
        //外部排序
    }
}
