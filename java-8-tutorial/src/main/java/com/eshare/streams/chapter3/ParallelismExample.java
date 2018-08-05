package com.eshare.streams.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 并行处理例子
 * Created by liangyh on 2018/8/5.
 * Email:10856214@163.com
 */
public class ParallelismExample {
    public static void main(String[] args){
         List<Task> taskList = new ArrayList<Task>();
         for(int i=0;i<1000;i++){
             taskList.add(new Task(((long) (i)),i+1,i+2));
         }
        Stream<Task> taskStream = taskList.parallelStream();
        taskStream.forEach(p->{
            System.out.println(p.getId()+":"+p.caculate());});

    }
}

class Task{

    private Long id ;

    private Integer x;
    private Integer y;

    public Task(Long id, Integer x, Integer y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public Integer caculate(){
        return this.x+this.y;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
