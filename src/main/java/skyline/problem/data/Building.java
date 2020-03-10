package skyline.problem.data;

import lombok.Data;

@Data
public class Building {

    public static final int GROUND_LEVEL = 0;

    public Building(Dimension dimension) {
        this.upperLeft = new KeyPoint(dimension.getLeftX(), dimension.getHeight());
        this.lowerRight = new KeyPoint(dimension.getRightX(), GROUND_LEVEL);
    }

    private KeyPoint upperLeft;
    private KeyPoint lowerRight;
}
