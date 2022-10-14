package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Category;

public interface ICategoryDao {
	void add(Category category);
	void delete(int categoryId);
	void update(Category category);
}
