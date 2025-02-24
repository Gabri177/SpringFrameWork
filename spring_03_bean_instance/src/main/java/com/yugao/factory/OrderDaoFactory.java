package com.yugao.factory;

import com.yugao.dao.OrderDao;
import com.yugao.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("OrderDaoFactory getOrderDao method called ");
        return new OrderDaoImpl();
    }
}
