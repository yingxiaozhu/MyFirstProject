package com.cyj.MyFirstProject.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5SaltUtil {
	
	
	/**
     * 校验密码是否正确
     *
     * @param passwd
     * @param passwdInDb
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static boolean validPassword(String passwd, String passwdInDb) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (getEncryptedPasswd(passwd).equals(passwdInDb)) {
            return true;
        } else {
            return false;
        }
    }
    
    
    /**
     * 生成含有盐的MD5密码
     *
     * @param passwd
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String getEncryptedPasswd(String passwd) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(passwd.getBytes("UTF-8"));
        byte[] passwdByte = md.digest();
        return byteToHexString(passwdByte);
    }
    
    
    /**
     * 将指定byte数组转换成16进制字符串
     *
     * @param passwdByte
     * @return
     */
    public static String byteToHexString(byte[] passwdByte) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < passwdByte.length; i++) {
            String hex = Integer.toHexString(passwdByte[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            hexString.append(hex.toUpperCase());
        }
        return hexString.toString();
    }

}
