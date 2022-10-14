package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("added with hibernate.");
		
	}

	@Override
	public void delete(int courseId) {
		System.out.println("deleted with hibernate.");
		
	}

	@Override
	public void update(Course couse) {
		System.out.println("updated with hibernate.");
		
	}

}
