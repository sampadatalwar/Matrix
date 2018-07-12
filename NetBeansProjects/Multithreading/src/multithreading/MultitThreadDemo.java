/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author test
 */
public class MultitThreadDemo extends Thread{
    public void run()
    {
        try
        {
            System.out.println ("Thread " +Thread.currentThread().getId() +" is running");
 
        }
        catch (Exception e)
        {
          
            System.out.println ("Exception caught");
        }
    }
    
}
