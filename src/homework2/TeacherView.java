package homework2;
import data.Teacher;
import view.UserView;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnconsole(List<Teacher> list) {
        for (Teacher teacher: list){
            System.out.println(teacher);
        }
    }
}
