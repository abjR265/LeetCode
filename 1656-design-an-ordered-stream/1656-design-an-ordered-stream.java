import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    private String[] stream;
    private int ptr;

    public OrderedStream(int n) {
        stream = new String[n];
        ptr = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        stream[idKey - 1] = value; // Adjust idKey to zero-based index
        
        // Collect values from `ptr` while they are not null
        while (ptr < stream.length && stream[ptr] != null) {
            result.add(stream[ptr]);
            ptr++;
        }
        
        return result;
    }
}
