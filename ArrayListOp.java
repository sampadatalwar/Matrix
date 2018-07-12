/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

/**
 *
 * @author test
 */
public class ArrayListOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> al=new ArrayList<>(10);
        
        al.add(10);
        al.add(50);
        al.add(20);
        al.add(60);
        al.add(30);
        
        System.out.println(al.size());
        
        al.remove(1);
        System.out.println(al.size());
        
        al.add(70);
        
        System.out.println(al.size());
        System.out.println(al);
        
        System.out.println(al.indexOf(20));
        al.add(10);
        System.out.println(al);
        System.out.println(al.lastIndexOf(10));
        
        al.add(4,40); //add is an overloaded method
        System.out.println(al);
        
        ArrayList<String> al2=new ArrayList<>();
        
        al2.add("sam1");
        al2.add("sam2");
        
        System.out.println(al2);
        
        Iterator it=al.iterator();
       
        
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        Queue q=new PriorityQueue(al);
        
        //System.out.println(q);
        Iterator it2=q.iterator();
        
        while(it2.hasNext())
        {
            System.out.print(it2.next()+" "); //may not be ordered accoding to insertion
        }
        System.out.println();
        
        ListIterator ls=al.listIterator();
        
        while(ls.hasNext())
        {
            System.out.print(ls.nextIndex()+":"+ls.next()+" ");
        }
        System.out.println();
        while(ls.hasPrevious())
        {
            System.out.print(ls.previousIndex()+":"+ls.previous()+" ");
        }
        
        al2.set(1,"sam");
        System.out.println(al2);
        
        int i=1;
        
        while(ls.hasNext())
        {
            ls.next();
            ls.set(i);
            i++;
        }
        
        System.out.println(al);
        
        /*while(ls.hasNext() || ls.hasPrevious())
        {
            System.out.println(ls.next());
        System.out.println(ls.previous());
        }*/
        
        /*ListIterator l1=al.listIterator();
        ListIterator l2=al.listIterator(1);
        
        while (l1.hasNext() || l2.hasPrevious())
        {
            System.out.println(l1.next());
 
            System.out.println(l2.previous());
        }*/
        
        
        ListIterator it1=al.listIterator(2);
        while(it1.hasNext())
        {
            it1.next();
            it1.remove();   
        }
        
        System.out.println("  "+al);
        
        for(int j=0; j<al.size(); j++)
        {
            System.out.println(al.get(j));
        }
        
        
    }
    
}
