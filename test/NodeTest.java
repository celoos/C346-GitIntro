/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chris
 */
public class NodeTest {
    
    public NodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of next method, of class Node.
     */
    @Test
    public void testNext() {
        Node instance = new Node(1, null);
        ILinkedList expResult = null;
        ILinkedList result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of last method, of class Node.
     */
    @Test
    public void testLastWithAdditionalNode() {
        Node secondNode = new Node(2);
        Node instance = new Node(1, secondNode);
        ILinkedList expResult = secondNode;
        ILinkedList result = instance.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testLastWithNoAdditionalNode() {
        Node instance = new Node(1);
        ILinkedList expResult = instance;
        ILinkedList result = instance.last();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of after method, of class Node.
     */
    @Test
    public void testAfterWithNoAdditionalNodes() {
        int n = 1;
        Node instance = new Node(1);
        ILinkedList expResult = null;
        ILinkedList result = instance.after(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAfterWithAdditionalNode() {
        int n = 1;
        Node additional = new Node(2);
        Node instance = new Node(1, additional);
        ILinkedList expResult = additional;
        ILinkedList result = instance.after(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test(expected = NullPointerException.class) 
    public void testAfterShouldThrowNullPointer() {
        int n = 5;
        Node instance = new Node(1);
        ILinkedList result = instance.after(n);
    }

    /**
     * Test of detach method, of class Node.
     */
    @Test
    public void testDetach() {
        Node nextNode = new Node(2);
        Node instance = new Node(1, nextNode);
        ILinkedList expResult = nextNode;
        ILinkedList result = instance.detach();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDetachNoAdditional() {
        Node instance = new Node(1);
        ILinkedList expResult = null;
        ILinkedList result = instance.detach();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Node.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Node instance = new Node(1);
        Object expResult = 1;
        Object result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class Node.
     */
    @Test
    public void testSet() {
        Object value = 2;
        Node instance = new Node(1);
        instance.set(value);
        Object newValue = instance.get();
        assertEquals(value, newValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class Node.
     */
    @Test
    public void testSetNext() {
        ILinkedList next = new Node(2);
        Node instance = new Node(1);
        instance.setNext(next);
        Node newNext = instance.next;
        assertEquals(next, newNext);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of append method, of class Node.
     */
    @Test
    public void testAppend() {
        ILinkedList nextList = new Node(2, new Node(3));
        Node firstList = new Node(1);
        firstList.append(nextList);
        
        Node curr = firstList;
        String result = "";
        while (curr != null)
        {
            result += curr.data + "";
            curr = curr.next;
        }
        String expResult = "123";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAppendNull() {
        ILinkedList nextList = null;
        Node firstList = new Node(1);
        firstList.append(nextList);
        
        Node curr = firstList;
        String result = "";
        while (curr != null)
        {
            result += curr.data + "";
            curr = curr.next;
        }
        String expResult = "1";
        assertEquals(expResult,result);
    }

    /**
     * Test of insert method, of class Node.
     */
    @Test
    public void testInsertFirstNodeNullNext() {
        ILinkedList oldFirst = new Node(1);
        ILinkedList newFirst = new Node(2, new Node(3));
        oldFirst.insert(newFirst);
        
        Node curr = (Node) newFirst;
        String result = "";
        while (curr != null)
        {
            result += curr.data + "";
            curr = curr.next;
        }
        String expResult = "231";
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInsertFirstNodeNonNullNext() {
        ILinkedList oldFirst = new Node(1, new Node(2));
        ILinkedList newFirst = new Node(3, new Node(4));
        oldFirst.insert(newFirst);
        
        Node curr = (Node) newFirst;
        String result = "";
        while (curr != null)
        {
            result += curr.data + "";
            curr = curr.next;
        }
        String expResult = "3412";
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
