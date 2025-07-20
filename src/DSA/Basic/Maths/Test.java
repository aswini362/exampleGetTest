package DSA.Basic.Maths;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String...args){
        String s1="Test";
        String s2="Test";
        String s3=new String("Test");
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s1==s3.intern());

        Map<Integer,Integer> map=new LinkedHashMap<>();
    }
}
