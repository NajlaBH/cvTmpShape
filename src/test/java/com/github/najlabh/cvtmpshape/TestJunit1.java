/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.najlabh.cvtmpshape;

/**
 *
 * @author najlanetbean
 */
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {
    String message = "najlaNetbeans";	
    MessageUtil messageUtil = new MessageUtil(message);
   
    @Test
    public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}
