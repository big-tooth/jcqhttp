package com.drophair.jcqhttp.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.drophair.jcqhttp.service.ICqbotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@Slf4j
@Service
public class CqbotServiceImpl implements ICqbotService {
    @Override
    public void cqbotEvenHandle(HttpServletRequest request) {
        JSONObject jsonParam = this.getJSONParam(request);
//        log.info("接收参数为:{}",jsonParam.toString()/* !=null ? "SUCCESS" : "FALSE"*/);
        if("message".equals(jsonParam.getString("post_type"))){
            String message = jsonParam.getString("message");
            if (!StringUtils.isEmpty(message)) {
                log.info("接收参数为:{}",jsonParam.toString());
            }
        }
    }

    public JSONObject getJSONParam(HttpServletRequest request){
        JSONObject jsonParam = null;
        try {
            // 获取输入流
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));

            // 数据写入Stringbuilder
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = streamReader.readLine()) != null) {
                sb.append(line);
            }
            jsonParam = JSONObject.parseObject(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonParam;
    }
}
