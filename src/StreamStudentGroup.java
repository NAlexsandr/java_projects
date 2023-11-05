import ru.gb.oseminar.data.StudentGroup;
import java.util.List;

public class StreamStudentGroup implements Iterable<StudentGroup> {
    ;
    private List<StudentGroup> StreamStudentGroup;

    StreamStudentGroup(List<StudentGroup> streamStudentGroup) {
        this.StreamStudentGroup = streamStudentGroup;
    }

    public List<StudentGroup> getStreamStudentGroup() {
        return StreamStudentGroup;
    }

    public void setStreamStudentGroup(List<StudentGroup> streamStudentGroup) {
        this.StreamStudentGroup = streamStudentGroup;
    }

    @Override
    public StreamStudentGroupIterator iterator() {return new StreamStudentGroupIterator(this);}
}
