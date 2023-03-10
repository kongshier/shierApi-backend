package com.shier.shierapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.shier.shierapiclientsdk.model.User;
import com.shier.shierapiclientsdk.utils.*;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Shier 2023/2/13
 * 客户端
 */
public class ShierClient {

    private static final String GATEWAY_POST = "http://localhost:8099";

    private String accessKey;

    private String secretKey;

    public ShierClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        HashMap<String, Object> paraMap = new HashMap<>();
        paraMap.put("name", name);
        String result = HttpUtil.get(GATEWAY_POST + "/api/name/get", paraMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post(GATEWAY_POST + "/api/name/post", paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPostByJson(User user) throws UnsupportedEncodingException {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_POST + "/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println("status = " + httpResponse.getStatus());
        if (httpResponse.isOk()) {
            return httpResponse.body();
        }
        return "JSON数据调用请求失败";
    }

    private Map<String, String> getHeaderMap(String body) throws UnsupportedEncodingException {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        hashMap.put("sign",SignUtils.getSign(body, secretKey));
        // 防止中文乱码
        hashMap.put("body", URLEncoder.encode(body, StandardCharsets.UTF_8.name()));
        hashMap.put("nonce", RandomUtil.randomNumbers(5));
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return hashMap;
    }


}
