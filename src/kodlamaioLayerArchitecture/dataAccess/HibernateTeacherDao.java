package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("added with hibernate.");
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("updated with hibernate.");
		
	}

	@Override
	public void delete(int teacherId) {
		System.out.println("deleted with hibernate.");
	}

}
