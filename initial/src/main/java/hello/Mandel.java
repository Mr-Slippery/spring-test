package hello;

public class Mandel {

    private final double x;
    private final double y;
    private final double r;
    private final long maxIter;

    public Mandel(double x, double y, double r, long maxIter) {
    	this.x = x;
    	this.y = y;
    	this.r = r;
    	this.maxIter = maxIter;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double getR() {
    	return r;
    }
    
    public long getMaxIter() {
    	return maxIter;
    }
}