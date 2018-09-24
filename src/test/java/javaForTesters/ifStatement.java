package javaForTesters;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ifStatement {

    String url = "www.eviltester.com";
    String url1 = "eviltester.com";
    String expectedUrl = "http://www.eviltester.com";

    @Test
    public void ifAddHttp() {

        if (!url.startsWith("http")) {
            url = addHttp(url);
        }
        assertions();
    }

    @Test
    public void ifElseAddHttp() {

        if (url.startsWith("http:")) {
            //do Nothing
        } else {
            url = addHttp(url);
        }
        assertions();
    }

    @Test
    public void ifElseNestedHttp() {
        if (url.startsWith("http:")) {
            //do Nothing
        } else {
            if (!url.startsWith("www")) {
                url = "www." + url;
            }
            url = addHttp(url);
        }
        assertions();
    }

    @Test
    public void nestedIfElseHorror() {
        boolean truthy = true;
        boolean falsey = false;

        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (falsey || truthy) {
                        assertEquals(truthy, true);
                        assertEquals(falsey, false);
                    } else {
                        assertEquals(truthy, true);
                        assertEquals(falsey, true);
                    }
                } else {
                    if (!truthy) {
                        if (falsey) {
                            assertEquals(falsey, true);
                            assertEquals(truthy, false);
                        } else {
                            assertEquals(falsey, false);
                            assertEquals(truthy, false);
                        }
                    }
                }
            }
        }
    }

    private void assertions() {
        assertTrue(url.startsWith("http"));
        assertEquals(expectedUrl, url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }
}
