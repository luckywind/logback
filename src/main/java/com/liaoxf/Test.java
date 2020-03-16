package com.liaoxf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }

    public void test() {
        logger.info("info ... ");
        logger.error("error .. .");
        logger.error("占位符{},第二个{}",1,2);
    }
}
