package com.joshua.transform.jad;

import org.junit.Test;

/**
 * Created by joshua on 2017/4/18.
 */
public class TransformClassTest {
    @Test
    public void testCommand(){
        TransformClass.transformClass("src\\test\\resources\\class\\com\\ailk\\security\\support\\Run.class",
                "src\\test\\resources\\class\\com\\ailk\\security\\support");
    }

}