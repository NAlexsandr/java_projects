import ru.gb.oseminar.data.StudentGroup;

import java.util.List;

public enum StreamStudentGroup1 implements Iterable<StudentGroup>{
    ;
    private List<StudentGroup> StreamStudentGroup;

    StreamStudentGroup1(List<StudentGroup> streamStudentGroup) {
        this.StreamStudentGroup = streamStudentGroup;
    }

    public List<StudentGroup> getStreamStudentGroup() {
        return StreamStudentGroup;
    }

    public void setStreamStudentGroup(List<StudentGroup> streamStudentGroup) {
        StreamStudentGroup = streamStudentGroup;
    }

    @Override
    public StudentStreamGroupIterator iterator() {return new StudentStreamGroupIterator(this);}
}
