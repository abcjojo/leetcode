//package com.java.leetcode.common;
//
//import lombok.Data;
//
//import java.util.ArrayList;
//
//@Data//省去了get、set方法，需要在pom.xml文件中导入lombok依赖
//public class UserTest {
//
//    private String username;
//    private String password;
//    private Integer age;
//    public UserTest(){
//
//    }
//
//    public UserTest(String username, String password, Integer age) {
//        this.username = username;
//        this.password = password;
//        this.age = age;
//    }
//
//
//    //public static void main(final String... args)
//    public static void main(String[] args)
//    {
//        ArrayList<UserTest> list = new ArrayList<UserTest>();
//
//        list.add(new UserTest("liubei","111",40));
//        list.add(new UserTest("zhangfei","222",30));
//        list.add(new UserTest("guanyu","333",35));
//
//
//        list.removeIf(u -> "liubei".equals(u.getUsername()));
//
//        System.out.println("list: "+list.toString());
//
//
//
//
//        System.out.println("\ntest1:");
//        list.stream().map(n->n)
//                .forEach(n-> System.out.println(n));
//
//        System.out.println("\ntest2--age:");
//        list.stream().map(n->n.getAge())
//                .forEach(n-> System.out.println(n));
//
//        System.out.println("\ntest3--age:");
//        list.stream().map(n->n.getAge())
//                .map(n->n).forEach(n-> System.out.println(n));
//
//        System.out.println("\ntest2--username:");
//        list.stream().map(n->n.getUsername())
//                .forEach(n-> System.out.println(n));
//
//        System.out.println("\ntest3--username:");
//        list.stream().map(n->n.getUsername())
//                .map(n->n).forEach(n-> System.out.println(n));
//    }
//}