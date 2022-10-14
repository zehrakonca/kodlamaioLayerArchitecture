package kodlamaioLayerArchitecture.dataAccess;

import kodlamaioLayerArchitecture.entities.Teacher;

public interface ITeacherDao {
	void add(Teacher teacher);
	void update(Teacher teacher);
	void delete (int teacherId);
}
