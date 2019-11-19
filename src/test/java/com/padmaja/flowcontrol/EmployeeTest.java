package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class EmployeeTest {

         Employee employee;
         Animal animal;
         Jumpable jumpable;
         Moveable moveable;
         //Programmer programmer;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){

            employee = new Employee();
            animal = new Animal();
            jumpable = new Jumpable() {
                @Override
                public void relax() {

                }
            };
            moveable = new Moveable() {
                @Override
                public void relax() {

                }
            };
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            employee = null;
        }
        @Test
        public void inheritanceExample() {
             employee.startProjectWork();
        }
    @Test
    public void inheritanceExample1() {
        employee.startProjectWork();
        employee.reachOffice();;
        animal.relax();
        jumpable.relax();
//        jumpable.relax();
        moveable.relax();
        jumpable.relax();

        ;
        //manager.teamSize();
    }


}



