package net.rbj.shoppingbackend.dao;

import java.util.List;

import net.rbj.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list ();

	Category get(int id);
}
