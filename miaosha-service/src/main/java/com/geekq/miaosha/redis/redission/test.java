package com.geekq.miaosha.redis.redission;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 邱润泽
 */
public class test {

    public static void main(String[] args) {


        /**
         * 分10段 共有数量100个  10个一组
         */

        int num =0;
        List<Integer> list = new ArrayList<>();
        int  numb =0;
        for (int i = 0; i <=100 ; i++) {
            num ++;
            if(i%10 == 0){
                list.add(i);
            }
        }

//产生0-(arr.length-1)的整数值,也是数组的索引
        int index=(int)(Math.random()*list.size());
        int rand = list.get(index);
        System.out.println(rand);

    }

}
