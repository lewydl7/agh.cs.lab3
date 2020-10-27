package agh.cs.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionParser {

    public MoveDirection[] parse(String[] args){
        final List<MoveDirection> movesList = new ArrayList<>();
        Arrays.stream(args).forEach(arg -> {
            switch (arg){
                case "f":
                case "forward": {
                    movesList.add(MoveDirection.FORWARD);
                    break;
                }
                case "b":
                case "backward": {
                    movesList.add(MoveDirection.BACKWARD);
                    break;
                }
                case "l":
                case "left": {
                    movesList.add(MoveDirection.LEFT);
                    break;
                }
                case "r":
                case "right": {
                    movesList.add(MoveDirection.RIGHT);
                    break;
                }
            }
        });

        return movesList.toArray(new MoveDirection[0]);
    }
}
