package skyline.problem.app;

import skyline.problem.data.Building;
import skyline.problem.data.KeyPoint;
import skyline.problem.data.Skyline;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import static skyline.problem.logic.RelocateOverlayedCorner.relocateOverlayedCorner;
import static skyline.problem.logic.RemoveOverlayedCorner.removeOverlayedCorner;

public class DetermineSkyline {

    public static Skyline determineSkyline(Collection<Building> buildings) {
        var upperLeftCorners = buildings.stream()
                .map(Building::getUpperLeft)
                .map(corner -> relocateOverlayedCorner(corner, buildings))
                .collect(Collectors.toList());
        var lowerRightCorners = buildings.stream()
                .map(Building::getLowerRight)
                .map(corner -> removeOverlayedCorner(corner, buildings))
                .collect(Collectors.toList());

        var skylinePoints = new HashSet<KeyPoint>();
        skylinePoints.addAll(upperLeftCorners);
        skylinePoints.addAll(lowerRightCorners);
        return new Skyline(skylinePoints);
    }

}
