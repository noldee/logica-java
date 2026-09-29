package com.streams;

import java.util.Properties;
import java.util.stream.Collectors;

public class Stream7 {
    public static void main(String[] args) {

        Properties props = new Properties();

        props.setProperty("JAVA_HOME", "/opt/java/21");
        props.setProperty("MAVEN_HOME", "/opt/maven");
        props.setProperty("CATALINA_HOME", "/opt/tomcat8");

        String value = props.values().stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" - "));
        System.out.println(value);
    }

}