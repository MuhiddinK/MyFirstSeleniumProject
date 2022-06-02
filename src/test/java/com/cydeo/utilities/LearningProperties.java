package com.cydeo.utilities;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        //key = value (Map)
        //os.name = Mac OS X
        //user.name = cybertekchicago-1
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }

}
