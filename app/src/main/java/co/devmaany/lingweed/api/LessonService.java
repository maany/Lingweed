package co.devmaany.lingweed.api;

import java.util.List;

import co.devmaany.lingweed.Lesson;

/**
 * Created by devmaany on 4/6/16.
 */
public interface LessonService {

    Lesson saveOrUpdate(Lesson lesson);
    List<Lesson> getAll();
    Lesson getById(Integer id);
    Lesson deleteLesson(Lesson lesson);
}
