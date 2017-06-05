/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.najlabh.cvtmpshape;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author najlanetbean
 */
public class TestJunit {
    @Test
    public void testAdd() {
      String str = "Junit is working fine";
      assertEquals("Junit is working fine",str);
    }
    
    
    String message = "Hello iText7 from Netbeans IDE 8.2";	
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}
