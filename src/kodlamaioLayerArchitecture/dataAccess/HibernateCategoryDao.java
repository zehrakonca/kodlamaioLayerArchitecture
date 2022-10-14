package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("added with hibernate.");
		
	}

	@Override
	public void delete(int categoryId) {
		System.out.println("deleted with hibernate.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("updated with hibernate.");
		
	}

}
