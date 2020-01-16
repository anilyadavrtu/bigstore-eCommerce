package com.bigstore.controller;

import com.bigstore.domainobject.CustomerDO;
import org.springframework.stereotype.Controller;

@Controller

public class HomeController
{
    public static void main(String[] args) {
       CustomerDO cus=new CustomerDO(1L,"11","ss","ad@g,ao.com","9090090");

    }
}
