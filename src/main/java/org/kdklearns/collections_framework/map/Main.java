package org.kdklearns.collections_framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("HashMap");
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "shree ji");
        students.put(2, "laal ju");
        students.put(3, "sonam");
        students.put(4, "sameer");
        System.out.println(students);
        System.out.println(students.getOrDefault(5, "shree ji"));
        System.out.println(students.containsKey(2));
        System.out.println(students.containsValue("sameer"));

        System.out.println("\nTreeMap");
        TreeMap<Integer, String> employees = new TreeMap<>();
        employees.put(3, "Kundan");
        employees.put(1, "Keshav");
        employees.put(4, "Rupesh");
        employees.put(2, "Ayanabha");
        employees.put(5, "Nitin");
        System.out.println(employees);
        System.out.println("firstKey -> " + employees.firstKey());
        System.out.println("LastKey -> " + employees.lastKey());
        System.out.println("floorKey -> " + employees.floorKey(3));
        System.out.println("lowerKey -> " + employees.lowerKey(3));
        System.out.println("celingKey -> " + employees.ceilingKey(3));
        System.out.println("higherKey -> " + employees.higherKey(3));

        System.out.println("\nIteration");
        Set<Integer> keys = employees.keySet();
        for (int key: keys) {
            System.out.print(employees.get(key) + " ");
        }

        // hashcode
        System.out.println("\nHashcode");
        String username = "heyitskdk";
        Double number = 213d;
        System.out.println(username.hashCode());
        System.out.println(number.hashCode());

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
