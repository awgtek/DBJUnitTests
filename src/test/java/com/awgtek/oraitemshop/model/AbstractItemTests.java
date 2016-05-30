/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awgtek.oraitemshop.model;

import com.awgtek.oraitemshop.dao.ItemDAO;
import com.awgtek.oraitemshop.service.ItemService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

// see https://www.javacodegeeks.com/2011/10/spring-3-testing-with-junit-4.html
@ContextConfiguration
public class AbstractItemTests 
            extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    protected ItemDAO itemDao;
    @Autowired
    protected ItemService itemService;
    
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
    
    @Test
    public void sampleTest() {
        System.out.println("Number of rows is: " + itemService.listItem().size());
    }
     

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
