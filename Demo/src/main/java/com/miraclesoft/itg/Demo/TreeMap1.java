package com.miraclesoft.itg.Demo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();	
    map.put(100,"Teja");
    map.put(200,"Hema");
    map.put(300,"Akhila");
    map.put(400,"Aj");
    for(Map.Entry m:map.entrySet())
    {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
    System.out.println("***********************");
    System.out.println("Descending Map"+map.descendingMap());
    System.out.println("Head Map"+map.headMap(300));
    System.out.println("Tail Map"+map.tailMap(400));
    map.remove(300);
    System.out.println("After removing the value 300");
    for(Map.Entry m:map.entrySet())
    {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
	}

}
