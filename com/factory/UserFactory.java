package com.ly.factory;

import com.ly.dao.UserDao;
import com.ly.dao.impl.UserDaoImpl;

import java.util.ResourceBundle;
/**
 *  工厂类
 * 构建任意类型的对象
 */
public class UserFactory {
    public  static ResourceBundle bundle;

    static {
        //ResourceBundle 专门用于java国际化 默认获取src下的资源文件（文件名）
        bundle=ResourceBundle.getBundle("instance");
    }
    /*
    public static UserDao getUserDaoInstance(){
        return new UserDaoImpl();
    }*/

    public static <T>T getInstance(String key,Class<T> classType)throws ClassNotFoundException{
        String className=bundle.getString(key);
        try {
            return (T)Class.forName(className).newInstance();
        } catch (Exception e) {
           throw  new RuntimeException(e);
        }
    }

}
