import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        DiskHead dh = new DiskHead(1000);
        int simulationTime = 1000;
        Request[] requests = generateRequestQueue(1000, 1000, 10000);

        int currentTime = 0;
        int sumOfHeadMoves = 0;

        for (Request r : requests) {
            sumOfHeadMoves += dh.getDistanceBetweenBlocks(dh.getCurrentBlock(), r.getBlock());
            dh.moveToBlock(r.getBlock());
            currentTime += (r.getTime() - currentTime);
        }
    }

    private static Request[] generateRequestQueue(int size, int blocks, int simulationTime) {
        Request[] result = new Request[size];

        for (int i = 0; i < size; i++) {
            int blockNum = (int) (Math.random() * blocks + 1);
            int joinTime = (int) (Math.random() * simulationTime + 1);
            result[i] = new Request(blockNum, joinTime);
        }
        return result;
    }


}
