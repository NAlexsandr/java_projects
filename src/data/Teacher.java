package data;
import data.User;
import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private Long teacherId;

    public Teacher(String firstName, String secondName, String lastName, Long teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" + "firstName='" + this.getFirstName() + '\'' +
                ", secondName='" + this.getSecondName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                "teacherId=" + teacherId +
                '}';
    }

}
