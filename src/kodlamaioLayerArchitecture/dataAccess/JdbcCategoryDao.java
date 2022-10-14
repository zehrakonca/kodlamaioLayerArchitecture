package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("added with jdbc.");
		
	}

	@Override
	public void delete(int categoryId) {
		System.out.println("deleted with jdbc.");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("updated with jdbc.");
		
	}

}
