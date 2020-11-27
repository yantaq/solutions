package com.yulghun;

import com.yulghun.problems.IndexOnMatchEx;
import org.junit.Assert;
import org.junit.Test;

public class IndexOnMatchExTest {
    @Test public void arraySum_Test() {
        // arrange
        int[] input = new int[] {3, 2, 2, 4, 5, 2, 4};
        int expected = 3;

        // act
        int actual = new IndexOnMatchEx().arraySum(input);

        // assert
        Assert.assertEquals(expected, actual);
    }
}
