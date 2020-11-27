package com.yulghun;

import com.yulghun.problems.DoubleOnMatchEx;
import org.junit.Assert;
import org.junit.Test;

public class DoubleOnMatchExTest {
    @Test public void maxNum_Test() {
        // arrange
        int[] arr = new int[]{1,2,4,11,12,8};
        int num = 4;

        // act
        int actual = new DoubleOnMatchEx().maxNum(arr, num);
        int expected = 16;

        // assert
        Assert.assertEquals(expected, actual);

    }
}
