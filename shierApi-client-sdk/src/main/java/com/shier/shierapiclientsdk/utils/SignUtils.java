package com.shier.shierapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * @author Shier 2023/2/13
 * 签名工具
 */
public class SignUtils {
    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static String getSign(String body, String secretKey) {
        // 拼接字符串
        Digester digester = new Digester(DigestAlgorithm.SHA1);
        String content = body + '.' + secretKey;
        return digester.digestHex(content);
    }
}
