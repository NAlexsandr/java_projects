package homework;

import Data.Student;
import Data.Teacher;
import Data.User;
import Service.DataService;
import Service.DataService.*;

import java.util.ArrayList;
import java.util.List;

public class ControlerGroup {

    private List<Integer> listId;
    StudentGroupService studentGroupService = new StudentGroupService();
    DataService dataService = new DataService();

// Создание группы по Id Студентов и Учителя
    public StudentGroup createStudentGroupById(List<Integer> listId) {
        Teacher teach = new Teacher("7","7","7","7", 7);
        List<Student> studentList = new ArrayList<>();
        List<User> listUser = new ArrayList<User>();
        listUser = dataService.getAllUser();
        for (Integer id : listId) {
            for (User user : listUser) {
                if (user instanceof Student && ((Student) user).getStudentId() == id.intValue()) {
                    studentList.add((Student) user);
                }
                if (user instanceof Teacher && ((Teacher) user).getTeacherId() == id.intValue()) {
                    teach = (Teacher) user;
                }
            }
        }
        return studentGroupService.createStudentGroup (teach, studentList);

    }
}