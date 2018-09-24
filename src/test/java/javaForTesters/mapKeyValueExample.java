package javaForTesters;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class mapKeyValueExample {

    @Test
    public void mapExample() {
        Map<String, String> map = new HashMap<>();
        Map<String, String> newMap = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        assertEquals(3, map.size());

        map.put("key1", "newValue1");

        assertEquals("newValue1", map.get("key1"));

        assertTrue(map.containsKey("key1"));
        assertFalse(map.containsKey("key11"));

        assertTrue(map.containsValue("value2"));
        assertFalse(map.containsValue("value22"));

        newMap.putAll(map);

        assertEquals(3, newMap.size());

        map.remove("key1");
        assertEquals(2, map.size());

        map.clear();
        assertEquals(0, map.size());
        assertTrue(map.isEmpty());

    }
}
