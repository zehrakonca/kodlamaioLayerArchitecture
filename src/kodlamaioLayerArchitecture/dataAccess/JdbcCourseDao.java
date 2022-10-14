package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Course;

public class JdbcCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("added with jdbc.");
		
	}

	@Override
	public void delete(int courseId) {
		System.out.println("deleted with jdbc.");
		
	}

	@Override
	public void update(Course couse) {
		System.out.println("updated with jdbc.");
		
	}

}
