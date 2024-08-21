public class Skeleton extends Boss {
    private int arrowCount;


    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + arrowCount);
    }
}