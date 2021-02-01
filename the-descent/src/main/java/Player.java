import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            List<Integer> inputValues = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                inputValues.add(in.nextInt());
            }

            System.out.println(new Chooser().findHighestMountain(inputValues));
        }
    }
}

class Chooser {
    public String findHighestMountain(List<Integer> mountains){
        return IntStream.range(0, mountains.size())
                .boxed().max(Comparator.comparing(mountains::get))
                .orElse(-1).toString();
    }
}