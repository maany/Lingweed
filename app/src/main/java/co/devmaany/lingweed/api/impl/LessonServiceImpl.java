package co.devmaany.lingweed.api.impl;

import java.util.List;

import co.devmaany.lingweed.Lesson;
import co.devmaany.lingweed.api.LessonService;
import co.devmaany.lingweed.api.dao.LessonDAO;

/**
 * Created by devmaany on 4/6/16.
 */
public class LessonServiceImpl implements LessonService {
    private LessonDAO dao;
    @Override
    public Lesson saveOrUpdate(Lesson lesson) {
        return dao.saveOrUpdate(lesson);
    }

    @Override
    public List<Lesson> getAll() {
        return dao.getAll();
    }

    @Override
    public Lesson getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public Lesson deleteLesson(Lesson lesson) {
        return dao.deleteLesson(lesson);
    }
}
