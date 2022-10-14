package kodlamaioLayerArchitecture.business.abstracts;

import kodlamaioLayerArchitecture.entities.Course;

public interface CourseService {
	void add(Course course) throws Exception;
	void delete(int courseId);
	void update(Course course);
}
