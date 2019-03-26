public class DiskHead {

    private int diskSize;
    private int currentBlock;

    public DiskHead(int diskSize) {
        this.diskSize = diskSize;
        currentBlock = 0;
    }

    public void moveToBlock(int block) {
        currentBlock = block;
    }

    public int getDistanceBetweenBlocks(int firstBlockIndex, int secondBlockIndex) {
        return Math.abs(firstBlockIndex - secondBlockIndex);
    }

    public int getCurrentBlock() {
        return currentBlock;
    }
}
