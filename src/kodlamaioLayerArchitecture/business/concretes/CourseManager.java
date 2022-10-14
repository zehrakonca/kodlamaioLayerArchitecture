package kodlamaioLayerArchitecture.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioLayerArchitecture.business.abstracts.CourseService;
import kodlamaioLayerArchitecture.core.Logger;
import kodlamaioLayerArchitecture.core.SmsLogger;
import kodlamaioLayerArchitecture.dataAccess.ICourseDao;
import kodlamaioLayerArchitecture.entities.Course;

public class CourseManager implements CourseService{
	private ICourseDao courseDao;
	private Logger[] loggers;
	
	public List<String> courses = new ArrayList<String>();

	public CourseManager(ICourseDao courseDao,Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception{
		if (course.price<0) {
			System.out.println("the course price cannot be less than zero turkish lira.");
		}
		
		for (String courseNameCheck : courses) {
			if (course.getCourseName().equals(courseNameCheck)) {
				throw new Exception("this course already exist. please check name.");
			}
		}
		courseDao.add(course);
		System.out.println("course added.");
		
		for (Logger logger : loggers) {
			logger.Log();
		}
	}

	@Override
	public void delete(int courseId) {
		System.out.println("course deleted.");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("course updated.");
		
	}
	
	
}
