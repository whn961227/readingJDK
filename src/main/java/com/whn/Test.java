package com.whn;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        CharSequence cs = (CharSequence)sb;
        if (cs instanceof StringBuffer){
            System.out.println("1");
        } else
            System.out.println("0");

    }

}
