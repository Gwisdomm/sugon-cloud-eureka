package com.sugon.gaowz.httpconnection.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;


/*sys
 * @author gaowz
 * @version 2.10
 * @ClassName HttpController.java
 * @Description TODO
 * @createTime 2021年05月22日 14:08:00
 */
@RestController
public class HttpController {

    private static final Logger _log = LoggerFactory.getLogger(HttpController.class);

    @GetMapping("/requestHttp")
    public void requestHttp(){
        HttpURLConnection connection = null;
        try{
            //tring url  = "http://10.0.41.62:6080/sothisai/api/eshell/action/authenticator";
            String url  = "http://10.0.41.62:6080/sothisai/api/eshell/action/executeauthenticator";
            URL url1 = new URL(url);
            connection = (HttpURLConnection) url1.openConnection();
            connection.setRequestProperty("Cookie", "JSESSIONID=y00b5smiamwdwkzaisjw65; GV_JSESSIONID=8f43568d-b950-4eac-abdb-4e8ae00cb5e6");
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = ((HttpURLConnection) connection).getResponseCode();
            String msg = "";
            if (responseCode == HttpURLConnection.HTTP_OK){
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line = null;
                while((line = reader.readLine())!=null){
                    msg += line + "\n";
                }
                reader.close();
            }
            _log.info("current msg is " + msg);
        }catch (Exception e){
            e.printStackTrace();
            _log.error("转发出错，错误信息："+e.getLocalizedMessage()+";"+e.getClass());
        }finally {
            if (null != connection){
                try {
                    connection.disconnect();
                }catch (Exception e){
                    _log.info("httpURLConnection 流关闭异常："+ e.getLocalizedMessage());
                }
            }
        }

    }
}
