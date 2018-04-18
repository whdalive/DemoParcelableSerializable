package com.bit.whdalive.demoparcelableserializable;

import android.os.Parcel;
import android.os.Parcelable;

public class People implements Parcelable {

    //成员属性和set() & get() 方法
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //默认构造函数
    public People() {
    }

    //***************分割线******************
    //以下为实现Parcelable接口后需要实现的方法

    //我们手动创建的构造函数
    protected People(Parcel in) {
        readFromParcel(in);
    }

    //用于实现序列化
    //将对象转换成一个Parcel对象
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(sex);
        dest.writeInt(age);
    }

    //用于反序列化
    public static final Creator<People> CREATOR = new Creator<People>() {
        //反序列化创建对象
        @Override
        public People createFromParcel(Parcel in) {
            return new People(in);
        }

        //反序列化创建对象数组
        @Override
        public People[] newArray(int size) {
            return new People[size];
        }
    };

    //内容描述
    @Override
    public int describeContents() {
        //除了当前对象中存在文件描述符时返回1，其余都返回0
        return 0;
    }

    //通过反序列化得到的 Parcel 构造对象，注意需要与序列化过程写入的顺序一致
    private void readFromParcel(Parcel in){
        name = in.readString();
        sex = in.readString();
        age = in.readInt();
    }
}
