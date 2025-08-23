package org.collectionsusinginnbiltmethods.linkedlist;

import java.util.*;

public class DetectCycleWithLinkedList {

	public static boolean hasCycle(LinkedList<Integer> list) {
        Set<Integer> visited = new HashSet<>();
        
        for (Integer value : list) {
            if (visited.contains(value)) {
                return true;
            }
            visited.add(value);
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2); // adding duplicate just to simulate

        System.out.println("Cycle detected (simulated): " + hasCycle(list));
    }
}
