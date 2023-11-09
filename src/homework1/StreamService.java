package homework1;
import data.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private StreamStudentGroup streamStudentGroup;

    public StreamService(StreamStudentGroup streamStudentGroup) {
        this.streamStudentGroup = streamStudentGroup;
    }

    public StreamStudentGroup getStreamStudentGroup() {
        return streamStudentGroup;
    }

    public void setStreamStudentGroup(StreamStudentGroup streamStudentGroup) {
        this.streamStudentGroup = streamStudentGroup;
    }
    public List<StudentGroup> getSort(){
        List<StudentGroup> studentGroupList = new ArrayList<>(streamStudentGroup.getStreamStudentGroup());
        Collections.sort(Collections.unmodifiableList(studentGroupList));
        return studentGroupList;
    }
}
