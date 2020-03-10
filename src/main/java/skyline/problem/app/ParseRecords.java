package skyline.problem.app;

import skyline.problem.data.Building;

import java.util.Collection;
import java.util.stream.Collectors;

import static skyline.problem.logic.ReadDimensions.readDimension;

public class ParseRecords {

    public static Collection<Building> parseRecords(String records) {
        return readDimension(records).stream()
                .map(Building::new)
                .collect(Collectors.toList());
    }

}
