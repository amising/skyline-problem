package skyline.problem.app;

import skyline.problem.data.Skyline;

public class SolveSkylineProblem {

    public static Skyline solve(String records) {
        var buildings = ParseRecords.parseRecords(records);
        return DetermineSkyline.determineSkyline(buildings);
    }

}
