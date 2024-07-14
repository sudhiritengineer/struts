package com.jxd.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {
    String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
