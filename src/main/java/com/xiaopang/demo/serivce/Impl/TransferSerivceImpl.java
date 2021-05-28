package com.xiaopang.demo.serivce.Impl;

import com.xiaopang.demo.serivce.TransferSerivce;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TransferSerivceImpl implements TransferSerivce {
    @Override
    public Boolean doTransfer(String url) {
         url = "www.baidu.com";
        ProcessBuilder builder = new ProcessBuilder(
                "c:\\Program Files\\Internet Explorer\\iexplore", url);
        try {
            builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
