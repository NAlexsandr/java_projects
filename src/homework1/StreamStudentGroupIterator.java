package homework1;
import data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StreamStudentGroupIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> stream;
    private int counter;

    public StreamStudentGroupIterator(StreamStudentGroup stream) {
        this.stream = stream.getStreamStudentGroup();
        this.counter = 0;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    @Override
    public boolean hasNext() {
        return (counter > stream.size() - 1);
    }
    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return stream.get(--counter);
    }
}
