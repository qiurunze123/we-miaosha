package com.geekq.miasha.utils;

/**
 * @author 邱润泽
 *
 * 检查邮箱是否正确
 */
public class CheckCommonUtils {

    public static boolean checkEmail(String email)
    {// 验证邮箱的正则表达式
        String format = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        //p{Alpha}:内容是必选的，和字母字符[\p{Lower}\p{Upper}]等价。如：200896@163.com不是合法的。
        //w{2,15}: 2~15个[a-zA-Z_0-9]字符；w{}内容是必选的。 如：dyh@152.com是合法的。
        //[a-z0-9]{3,}：至少三个[a-z0-9]字符,[]内的是必选的；如：dyh200896@16.com是不合法的。
        //[.]:'.'号时必选的； 如：dyh200896@163com是不合法的。
        //p{Lower}{2,}小写字母，两个以上。如：dyh200896@163.c是不合法的。
        if (email.matches(format))
        {
            return true;// 邮箱名合法，返回true
        }
        else
        {
            return false;// 邮箱名不合法，返回false
        }
    }
}
