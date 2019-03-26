public class Request {
    private int block;
    private int time;

    public Request(int block, int time) {
        this.block = block;
        this.time = time;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
