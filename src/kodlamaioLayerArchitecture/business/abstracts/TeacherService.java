package kodlamaioLayerArchitecture.business.abstracts;

import kodlamaioLayerArchitecture.entities.Teacher;

public interface TeacherService {
	void add(Teacher teacher);
	void delete(int teacherId);
	void update(Teacher teacher);
}
