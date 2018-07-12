/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionssorting;
import java.util.*;
/**
 *
 * @author test
 */
public class CollectionsSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(39);
        ar.add(98);
        ar.add(52);
        ar.add(67);
        
        Collections.sort(ar);
        System.out.println(ar);
    }
    
}
