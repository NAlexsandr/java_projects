package homework2;

import data.Teacher;

import java.util.List;

public class TeacherService {
    List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public TeacherService() {
        this.teachers = null;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherService{" +
                "teacher=" + teachers +
                '}';
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void editorTeacher(String firstName, String secondName, String lastName, Long teacherId) {
        for (Teacher teacher: teachers){
            if (teacher.getFirstName().equals(firstName) && teacher.getSecondName().equals(secondName)
                                                         && teacher.getFirstName().equals(lastName)){
                teacher.setTeacherId(teacherId);
            }
        }
    }
}
