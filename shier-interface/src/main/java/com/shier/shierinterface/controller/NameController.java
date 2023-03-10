package com.shier.shierinterface.controller;

import cn.hutool.core.util.NumberUtil;
import cn.hutool.core.util.StrUtil;
import com.shier.shierapiclientsdk.model.User;
import com.shier.shierapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * 获取API名称
 * @author Shier
 */
@RestController
@RequestMapping("/name")
public class NameController {

    /**
     * {name} 获取参数列表
     * @param name
     * @return
     */
    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是：" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是：" + name;
    }

    @PostMapping("/user")
    public String getNameByPostByJson(@RequestBody User user, HttpServletRequest request) throws UnsupportedEncodingException {
        // String accessKey = request.getHeader("accessKey");
        // String nonce = request.getHeader("nonce");
        // String timestamp = request.getHeader("timestamp");
        // String sign = request.getHeader("sign");
        // String body = URLDecoder.decode(request.getHeader("body"), StandardCharsets.UTF_8.name());
        // boolean hasBlank = StrUtil.hasBlank(accessKey, body, sign, nonce, timestamp);
        //
        // // TODO 使用accessKey去数据库查询secretKey
        // // 校验accessKey
        // if (!accessKey.equals("shier")) {
        //     throw new RuntimeException("无权限");
        // }
        // // TODO 判断随机数nonce
        // if (Long.parseLong(nonce) > 1000000) {
        //     throw new RuntimeException("无权限");
        // }
        //
        // // 时间戳是否为数字
        // if (!NumberUtil.isNumber(timestamp)) {
        //     throw new RuntimeException("无权限");
        // }
        // // 五分钟内的请求有效
        // if (System.currentTimeMillis() - Long.parseLong(timestamp) > 5 * 60 * 1000) {
        //     throw new RuntimeException("无权限");
        // }
        // // 假设查到的secret是shierya 进行加密得到sign
        // String secretKey = "shierya";
        // String serverSign = SignUtils.getSign(body, secretKey);
        // if (!sign.equals(serverSign)) {
        //     // throw new RuntimeException("无权限");
        //     return "无权限";
        // }
        String result = "POST-JSON 你的名字是：" + user.getUserName();
        return result;
    }
}