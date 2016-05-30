package com.awgtek.oraitemshop.model;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


/**
 * The persistent class for the ITEM database table.
 * 
 */
@Entity
//@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="employee")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEM_ITEMID_GENERATOR", sequenceName="GEN_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEM_ITEMID_GENERATOR")
	@Column(name="ITEM_ID")
	private long itemId;

	@Column(name="ITEM_NAME")
	private String itemName;

	public Item() {
	}

	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}