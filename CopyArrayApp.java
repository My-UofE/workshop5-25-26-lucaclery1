import java.util.Arrays;
public class CopyArrayApp{
    public static void main(String[] args) {
        int nVals = args.length;
        // to create a new array of ints
        int[] myVals = new int[nVals];
        for (int i = 0; i < nVals; i++) {
            int item = Integer.parseInt(args[i]);
            // to allocate a value into the created array at index i
            myVals[i] = item;
        }
        System.out.println("original values: " + Arrays.toString(myVals));
        ArrayList<Integer> uniqueVals = new ArrayList<>();
        for (int i=0; i< nVals;i++) {
            int item = Integer.parseInt(args[i]);
            boolean check = True;
            for (int j=uniqueVals.length; j<uniqueVals.length; j++) {
                if (uniqueVals[j] == item) {
                    uniqueVals.add(j) = item;
                }
            }
        }
    }
}