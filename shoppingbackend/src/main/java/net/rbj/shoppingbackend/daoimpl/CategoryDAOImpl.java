package net.rbj.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import net.rbj.shoppingbackend.dao.CategoryDAO;
import net.rbj.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories = new ArrayList<>();
	
	static{
		
		Category category= new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Televsion");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		Category category1= new Category();

		//adding second category
		category1.setId(2);
		category1.setName("Mobile");
		category1.setDescription("This is some description for Mobile!");
		category1.setImageURL("CAT_2.png");
		
		categories.add(category1);
		
		Category category2= new Category();
		//adding first category
		category2.setId(3);
		category2.setName("Laptop");
		category2.setDescription("This is some description for laptop!");
		category2.setImageURL("CAT_3.png");
		
		categories.add(category2);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enchanced for loop
		
		for (Category category: categories){
			
			if(category.getId() == id) return category;
		}
		
		return null;
		
		
		
		
	}

}
