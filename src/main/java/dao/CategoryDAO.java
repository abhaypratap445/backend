package dao;

import java.util.List;

import model.Category;


public interface CategoryDAO {
	public void saveCategory(Category category);
	public void delete(int categoryId);
	
	public Category getById(int categoryId);
	
	public List<Category> list();
}