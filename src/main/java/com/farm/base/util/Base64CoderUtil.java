package com.farm.base.util;

import sun.misc.BASE64Decoder;

import java.io.IOException;

/**
 * base64解码
 *
 ** @Date: 2019-04-20 20:54
 */
public class Base64CoderUtil {

    /**
     * base64解码
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decode(String key) {
        byte[] bt = null;
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            bt = decoder.decodeBuffer(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bt;
    }
}