package logic.controller;

import logic.model.Lesson;
import logic.model.dao.NextLessonDao;

public class ViewNextLessonController {
	
	public Lesson getNextLesson() {
		NextLessonDao nextLessonDao = new NextLessonDao();
		Lesson nextLesson = nextLessonDao.getNextLesson();
		return nextLesson;
	}

}
