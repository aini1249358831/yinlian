package com.example.test.controller;

import com.example.test.service.PayServiceImpl;
import com.example.test.service.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author luxuezhen
 */

@Controller
public class PayController {
    @Autowired
    private PayServiceImpl payService;
    @Autowired
    private QueryServiceImpl queryService;

   /**网页在线支付
    * */
    @RequestMapping("/payWeb")
    public void payWeb(HttpServletRequest request, HttpServletResponse response){
        String s = payService.payWeb(request, response);
        try {
            PrintWriter writer = response.getWriter();
            writer.print(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @RequestMapping("/index")
    public String index(){

        return "temp";
    }
    /**
     * 二维码支付
     */
    @RequestMapping("/payCode")
    public void twoCodePay(HttpServletRequest request, HttpServletResponse response){

        String s = payService.payCode(request, response);
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.print(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    @RequestMapping("/query")
    public void query(HttpServletRequest request,HttpServletResponse response){
        String[] query = queryService.query(request, response);
        String reqMessage = "";
        String rspMessage = "";
        for (int i = 0; i < query.length; i++) {
          reqMessage =  query[0];
          rspMessage = query[1];
        }
        try {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("应答报文:</br>"+rspMessage+"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
