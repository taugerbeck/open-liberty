package com.ibm.ws.install.packaging.fat;

import org.junit.Test;

import junit.framework.Assert;

public class DummyTest extends InstallPackagesToolTest {
    private static final Class<?> c = DummyTest.class;

    /**
     * Always passing test case.
     * <p>
     * This FAT one always passing test case.
     * This test is required to ensure that at least one test case is executed so that a test report can be generated.
     *
     */
    @Test
    public void testAlwaysPass() throws Exception {

        String METHOD_NAME = "testAlwaysPass";
        entering(c, METHOD_NAME);

        Assert.assertTrue("Always passing test case", true);

        exiting(c, METHOD_NAME);
    }

}
