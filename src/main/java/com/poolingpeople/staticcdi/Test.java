package com.poolingpeople.staticcdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.validation.Validator;

/**
 * Created by alacambra on 03.12.14.
 */
public class Test {


    public static void main(String[] args){
        WeldContainer weld = new Weld().initialize();
        Hello hello = weld.instance().select(Hello.class).get();
        hello.create();


    }
}