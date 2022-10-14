package kodlamaioLayerArchitecture.business.concretes;

import kodlamaioLayerArchitecture.business.abstracts.TeacherService;
import kodlamaioLayerArchitecture.core.DatabaseLogger;
import kodlamaioLayerArchitecture.core.Logger;
import kodlamaioLayerArchitecture.dataAccess.ITeacherDao;
import kodlamaioLayerArchitecture.entities.Teacher;

public class TeacherManager implements TeacherService {
	private ITeacherDao teacherDao;
	private Logger[] loggers;

	public TeacherManager(ITeacherDao teacherDao, Logger[] loggers) {
		super();
		this.teacherDao = teacherDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Teacher teacher){
		teacherDao.add(teacher);
		System.out.println("teacher added.");
		for (Logger logger : loggers) {
			logger.Log();
		}
	}

	@Override
	public void delete(int teacherId) {
		System.out.println("teacher deleted.");
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("teacher updated.");
		
	}
	
	
}
