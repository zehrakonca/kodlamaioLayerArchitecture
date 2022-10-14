package kodlamaioLayerArchitecture;

import kodlamaioLayerArchitecture.business.concretes.CategoryManager;
import kodlamaioLayerArchitecture.business.concretes.CourseManager;
import kodlamaioLayerArchitecture.business.concretes.TeacherManager;
import kodlamaioLayerArchitecture.core.DatabaseLogger;
import kodlamaioLayerArchitecture.core.FileLogger;
import kodlamaioLayerArchitecture.core.Logger;
import kodlamaioLayerArchitecture.core.SmsLogger;
import kodlamaioLayerArchitecture.dataAccess.HibernateCategoryDao;
import kodlamaioLayerArchitecture.dataAccess.HibernateCourseDao;
import kodlamaioLayerArchitecture.dataAccess.JdbcTeacherDao;
import kodlamaioLayerArchitecture.entities.Category;
import kodlamaioLayerArchitecture.entities.Course;
import kodlamaioLayerArchitecture.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(), new DatabaseLogger(), new SmsLogger()};
		
//		------- course ------
		System.out.println("-------- course start --------");
		Course course = new Course();
		course.courseId = 1;
		course.category = "Software";
		course.courseName = "Software Developer Development Course : JAVA";
		course.price= 25;
		
//		Course course2 = new Course();
//		course2.courseId=2;
//		course2.category = "Software";
//		course2.courseName ="Software Developer Development Course : JAVA";
//		course.price = 25;
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
//		courseManager.add(course2);
		
		System.out.println("-------- course end --------");
		
//		------- course ------
		
// 		------- category ------
		
		System.out.println("-------- category start --------");
		Category category = new Category();
		category.categoryId = 1;
		category.categoryName = "Language Education";
		
//		Category category2 = new Category();
//		category2.categoryId = 1;
//		category2.categoryName = "Language Education";
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category);
//		categoryManager.add(category2);
		
		System.out.println("-------- category end --------");
		
//		------- category ------
		
		
//		------- teacher ------
		System.out.println("-------- teacher start --------");
		
		Teacher teacher = new Teacher(1, "Kakashi", "Hatake", "Ninja Tool Art");
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.add(teacher);
	
		System.out.println("-------- teacher end --------");
//		------- teacher ------
		

	}

}
