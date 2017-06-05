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
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

 
/**
 * One page shape for CV template Tests.
 */
public class OnePageCvShapeIT {
    
    public OnePageCvShapeIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of main method, of class OnePageCvShape.
     * @throws java.lang.Exception
     */
    //@Test
    public void testMain() throws Exception {
        System.out.println("Test Pdf Creation");
        String[] args = null;
        OnePageCvShape.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void checkDestinationFile(){
        //File file = new File(OnePageCvShape.DEST);
        //System.out.println(file.exists());
        File f = new File(OnePageCvShape.DEST);

	if(f.exists()){
		System.out.println("File existed");
            }else{
		System.out.println("File not found!");
	  }
    }
    
    /**
     * Test of createPdf method, of class OnePageCvShape.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreatePdf() throws Exception {
        System.out.println("createPdf");
        String dest;
        dest = "OnePageCV/Tests/sresultsIT.pdf";
        OnePageCvShape instance = new OnePageCvShape();
        instance.createPdf(dest);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
