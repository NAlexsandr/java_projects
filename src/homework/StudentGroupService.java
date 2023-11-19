package homework;

import Data.Student;
import Data.Teacher;

import javax.swing.plaf.synth.SynthRadioButtonUI;
import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private Teacher teacher;
    private List<Student> students;

    public StudentGroupService(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }
    public StudentGroupService() {
        this.teacher = null;
        this.students = null;
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students){
        return new StudentGroup(teacher, students);

    }
}
