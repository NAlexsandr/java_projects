package homework2;

import controler.UserControler;
import data.Teacher;

public class TeacherControler implements UserControler <Teacher>{

    TeacherService teacherService = new TeacherService();
    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        Long teacherId = null;
        return new Teacher(firstName, secondName, lastName, null);
    }

    public void editorTeacher (String firstName, String secondName, String lastName, Long teacherId){
       teacherService.editorTeacher(firstName, secondName, lastName, teacherId);
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teacher=" + teacherService.getTeachers() +
                '}';
    }
}
