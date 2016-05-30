/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awgtek.oraitemshop.dao;

import com.awgtek.oraitemshop.model.Item;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Administrator
 */
@Repository
public class ItemDAOImpl implements ItemDAO {
    private static final Logger logger = LoggerFactory.getLogger(ItemDAOImpl.class);

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addItem(Item item) {
        sessionFactory.getCurrentSession().save(item);
    }

    @Override
    public List<Item> listItem() {
        List<Item> itemList = sessionFactory.getCurrentSession().createQuery("from Item")
                .list();
        for(Item p : itemList){
            logger.info("Person List::"+p);
        }
        
        return itemList;
    }

    @Override
    public void removeItem(Integer id) {
        Item item = (Item) sessionFactory.getCurrentSession().load(
                Item.class, id);
        if (null != item) {
            sessionFactory.getCurrentSession().delete(item);
        }
    }
    
    
}
