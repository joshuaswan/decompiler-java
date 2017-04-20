package com.joshua.transform.jad;

import org.junit.Test;

/**
 * Created by joshua on 2017/4/18.
 */
public class OnlyDirectoryTest {

    @Test
    public void testCopy() throws Exception {
        OnlyDirectory.copy("src\\test\\resources\\class\\com","src\\test\\resources\\java\\com");
    }
}