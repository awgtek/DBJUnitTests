/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awgtek.oraitemshop.service;

import com.awgtek.oraitemshop.dao.ItemDAO;
import com.awgtek.oraitemshop.model.Item;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDAO itemDAO;
    
    @Transactional
    public void addContact(Item item) {
        itemDAO.addItem(item);
    }

 //   @Transactional
    public List<Item> listItem() {
        return itemDAO.listItem();
    }

    @Transactional
    public void removeItem(Integer id) {
        itemDAO.removeItem(id);
    }
    
}
