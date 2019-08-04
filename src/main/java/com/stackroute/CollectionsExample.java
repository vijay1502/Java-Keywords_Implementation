package com.stackroute;

import java.util.*;

public class CollectionsExample {
    public static void main(String args[]){
        CollectionsExample collectionsExample=new CollectionsExample();
        System.out.println(collectionsExample.arrayList());
        collectionsExample.queueExample();
    }
    public List<String> arrayList(){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Krishna");//Adding object in arraylist
        list.add("Vijay");
        list.add("Kashyap");
        System.out.println(list);
        list.clone();
        System.out.println(list.contains("Vijay"));
        System.out.println(list.get(1));
        list.remove("Kashyap");
        list.set(0,"Vijaya");
        System.out.println(list.lastIndexOf("Vijay"));
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    return list;}

    public Queue<String> queueExample() {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Krishna");
        queue.add("Kashyap");
        queue.add("Pundarikakshay");
        System.out.println(queue);
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        queue.poll();
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    return queue;}
}
