package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("added with jdbc.");
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("updated with jdbc.");
		
	}

	@Override
	public void delete(int teacherId) {
		System.out.println("deleted with jdbc");
	}

}
