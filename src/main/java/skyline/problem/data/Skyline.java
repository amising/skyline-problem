package skyline.problem.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Skyline {
    private Set<KeyPoint> keyPoints;
}