import java.util.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        List<Integer> inputs = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            inputs.add(in.nextInt()); // a temperature expressed as an integer ranging from -273 to 5526
        }

        System.out.println(new Chooser().getChoose(inputs));
    }
}

class Chooser {
    public String getChoose(List<Integer> inputs) {
        Optional<Integer> minPositive = inputs.stream().filter(integer -> integer > 0).min(Integer::compareTo);
        Optional<Integer> maxNegative = inputs.stream().filter(integer -> integer < 0).max(Integer::compareTo);

        if(minPositive.isEmpty() && maxNegative.isEmpty()){
            return String.valueOf(0);
        }
        if(minPositive.isEmpty()){
            return String.valueOf(maxNegative.get());
        }
        if(maxNegative.isEmpty()){
            return String.valueOf(minPositive.get());
        }

        if (Math.abs(maxNegative.get()) < minPositive.get()) {
            return String.valueOf(maxNegative);
        }
        return String.valueOf(minPositive.get());
    }
}