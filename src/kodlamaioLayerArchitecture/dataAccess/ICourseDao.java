package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Course;

public interface ICourseDao {
	void add(Course course);
	void delete(int courseId);
	void update(Course couse);
	
}
