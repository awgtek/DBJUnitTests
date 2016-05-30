/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.awgtek.oraitemshop.service;

import com.awgtek.oraitemshop.model.Item;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ItemService {
 	public void addContact(Item contact);
	public List<Item> listItem();
	public void removeItem(Integer id);
   
}
