package com.sunsw.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Sucre on 16/10/22.
 */
public class LangTest {

    private List<String> list = Collections.emptyList();
    private LinkedList<String> linkedList = new LinkedList();
    private List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
    private Map<String, String> map = new HashMap<String, String>();


    public void testList() {
        for (int i = 0; i < 12; i++) {
            list.add("node-" + i);
            linkedList.add("lindedNode-" + i);
            linkedList.get(0);
            map.put("key-" + i, "value-" + i);
        }
        String a = map.put("key-" + 1, "value-" + 12);
        String b = map.put("key-" + 1, "value-" + 1);
        map.get("");
        System.out.println(a);
        System.out.println(b);
        for (String str: list) {
            System.out.println(str);
        }
        for (Map.Entry<String, String> e : map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }
    }

    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        StringBuilder strBuilder = new StringBuilder();
        strBuffer.toString();
        strBuilder.toString();

        new LangTest().testList();
    }

}
