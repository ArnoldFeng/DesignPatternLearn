package com.fengtao.behaviorPattern.StrategyPattern;

import com.fengtao.behaviorPattern.StrategyPattern.firstVersion.Sorter;

public class Application {
    public static void main(String[] args){
        Sorter sorter = new Sorter();
        sorter.sortFile("c://fengtao/test.txt");
    }
}
