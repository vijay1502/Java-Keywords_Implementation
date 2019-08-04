package com.stackroute;

import java.util.*;

public class CollectionsExample {
    public static void main(String args[]){
        CollectionsExample collectionsExample=new CollectionsExample();
        System.out.println(collectionsExample.arrayList());
        collectionsExample.queueExample();
        collectionsExample.setExample();
        collectionsExample.treeSetExample();
        collectionsExample.stringIntegerMap();
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
    public Set<String> setExample(){
        HashSet<String> stringSet=new HashSet<String>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("This is sout-set");
        System.out.println(stringSet);
        System.out.println(" "+
        stringSet.contains("yes")+" "+
        stringSet.isEmpty()+" "+
        stringSet.remove("Hello")+" "+
        stringSet.size());
    return stringSet;}
    public TreeSet<String> treeSetExample(){
        TreeSet<String> stringTreeSet=new TreeSet<String>();
        stringTreeSet.add("Hello");
        stringTreeSet.add("Hello");
        stringTreeSet.add("Bells");
        stringTreeSet.add("Click");
        System.out.println(stringTreeSet);
        stringTreeSet.remove("Hello");
        System.out.println(stringTreeSet);
        return stringTreeSet;
    }

    public Map<String,Integer> stringIntegerMap(){
        HashMap<String,Integer> mapExample=new HashMap<>();
        mapExample.put("Vijay",1);
        mapExample.put("Vijayak",2);
        System.out.println(mapExample);
        return mapExample;
    }
}
