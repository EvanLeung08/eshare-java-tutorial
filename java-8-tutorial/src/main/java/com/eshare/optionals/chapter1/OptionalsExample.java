package com.eshare.optionals.chapter1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Optional;

/**
 * Created by liangyh on 2018/8/3.
 * Email:10856214@163.com
 */
public class OptionalsExample {

    public static void main(String[] args){
        //创建空实例
        Optional<User> userOptional = Optional.ofNullable(null);
        //以下注释去掉，会发现发生编译错误，因为optional要求用户使用get()前必须进行非空判断
        //System.out.println(userOptional.get());

        //不存在则创建空实例
        User user1 = userOptional.orElse(new User());
        System.out.println(user1);

        //流式使用示例，判断是否存在用户
        User user2 = new User("王八",11);
        Optional<User> userOptional1 = Optional.ofNullable(user2);
        userOptional1.filter(user->"王八".equals(user.getName())).ifPresent(user-> System.out.println("王八存在"));

     }



}
class  User{
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}