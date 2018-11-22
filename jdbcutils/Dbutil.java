package com.ly.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dbutil {
    public static DataSource dataSource=new ComboPooledDataSource();
    Dbutil dbutil=new Dbutil();

    private  Dbutil(){}

    public static Connection getCon(){
        Connection con=null;
        try {
            con=dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    //增删改
    public static int update(String sql,Object...params){
        int result=0;
        try {
            PreparedStatement ptmt=getCon().prepareStatement(sql);
            for(int i=0;i<params.length;i++){
                ptmt.setObject(i+1,params[i]);
            }
            result=ptmt.executeUpdate();
            close(ptmt,getCon());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    //查询
    public static <T>List<T> query(Class<T> clazz,String sql,Object...params){
        List<T> list=new ArrayList<>();
        try {
            PreparedStatement pstm=getCon().prepareStatement(sql);
            ResultSet rs=null;
            if(params.length!=0){
                for(int i=0;i<params.length;i++){
                    pstm.setObject(i+1,params[i]);
                }
            }
            rs=pstm.executeQuery();
            Field[] Fields = clazz.getDeclaredFields();
            while (rs.next()){
                T newObject=clazz.newInstance();
                for (Field f:Fields) {
                    Object columnValue = rs.getObject(f.getName());
                    //System.out.println(f.getName());
                    //获得属性名,并转换为首字母大写,主要是因为set方法后是首字母大写的属性名
                    String UpperFieldName = f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);
                    //找到对应的set方法,参数是方法参数类型的.class对象
                    Method method = clazz.getMethod("set" + UpperFieldName, f.getType());
                    //System.out.println(method);
                    //执行方法
                    method.invoke(newObject,columnValue);
                }
                list.add(newObject);
            }
            close(rs,pstm,getCon());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return list;
    }
    //关闭
    public static void close(Object...params){
        if(params!=null&&params.length>0){
            for(int i=0;i<params.length;i++){
                    try {
                        if(params[i] instanceof ResultSet) {
                            ((ResultSet) params[i]).close();
                        } else if(params[i] instanceof PreparedStatement){
                            ((PreparedStatement)params[i]).close();
                        }else if(params[i] instanceof Connection){
                            ((Connection)params[i]).close();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
        }
    }

}
