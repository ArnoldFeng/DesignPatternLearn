package com.fengtao.behaviorPattern.StrategyPattern.secondVersion;

import java.io.File;

public class Sorter2 {
    public void sortFile(String filePath) {
        File file  = new File(filePath);
        long fileSize = file.length();
        ISort sort = null;
        if (fileSize < 10000){
            sort = new QuickSort();
        }else if (fileSize < 1000000) {
            sort = new ExternalSort();
        }
        sort.sort(filePath);
    }
}
