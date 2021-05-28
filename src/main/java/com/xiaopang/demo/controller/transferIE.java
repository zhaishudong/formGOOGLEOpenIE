package com.xiaopang.demo.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.xiaopang.demo.serivce.TransferSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class transferIE {

    @Autowired
    private TransferSerivce transferSerivce;

    @GetMapping("/OpenIE")
    @ResponseBody
    public Boolean transfer( String url){
        return transferSerivce.doTransfer(url);
    }
}
