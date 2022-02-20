package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "str";
        String s3 = "str";
        String concatenatedStr = "st" + "r";

        String s2 = new String("str");
        final String s4 = s2.intern();
        assert (s1 == s3);
        assert !(s1 == s2);
        assert (s1 == s4);
        assert (s1 == concatenatedStr);
    }
}
