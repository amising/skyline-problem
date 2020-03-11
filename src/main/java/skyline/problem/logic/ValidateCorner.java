package skyline.problem.logic;

import skyline.problem.data.KeyPoint;

import java.util.function.Consumer;

public class ValidateCorner {

    public static void validateKorner(KeyPoint corner, Consumer<KeyPoint> onValid){
        onValid.accept(corner);
    }

}
