package kodlamaioLayerArchitecture.business.abstracts;

import kodlamaioLayerArchitecture.entities.Category;

public interface CategoryService {
	void add(Category category) throws Exception;
	void delete(int categoryId);
	void update(Category category);
}
