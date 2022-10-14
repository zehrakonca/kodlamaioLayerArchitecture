package kodlamaioLayerArchitecture.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioLayerArchitecture.business.abstracts.CategoryService;
import kodlamaioLayerArchitecture.core.FileLogger;
import kodlamaioLayerArchitecture.core.Logger;
import kodlamaioLayerArchitecture.dataAccess.ICategoryDao;
import kodlamaioLayerArchitecture.entities.Category;

public class CategoryManager implements CategoryService{
	private ICategoryDao categoryDao;
	private Logger[] loggers;

	public List<String> categories = new ArrayList<String>();
	
	public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception{
		for(String categoryNameCheck : categories) {
			if(category.getCategoryName().equals(categoryNameCheck)) {
				throw new Exception("this category name already exist. please check name.");
			}
		}
		categoryDao.add(category);
		System.out.println("category added.");
		for (Logger logger : loggers) {
			logger.Log();
		}
	}

	@Override
	public void delete(int categoryId) {
		System.out.println("category deleted.");
		
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}
	
	
}
