package hello;

public class Mandel {
	private final int maxIter;
	private int[] map;
	private double y;
	private double x;
	private int dj;
	private int di;
	private double dxdi;
	private double dydj;

	public Mandel(double x, double y, double dx, double dy, int di, int dj,
			int maxIter) {
		this.x = x;
		this.y = y;
		this.di = di;
		this.dj = dj;
		this.maxIter = maxIter;
		this.dxdi = dx / di;
		this.dydj = dy / dj;
	}

	private int mand(double a, double b) {
		int it;
		double a1, a2;
		double b1, b2;
		for (it = 0, a1 = 0.0, b1 = 0.0; it < maxIter && a1 * a1 + b1 * b1 < 4; a2 = a1
				* a1 - b1 * b1 + a, b2 = 2 * a1 * b1 + b, a1 = a2, b1 = b2, it++) {
		}
		if (it < maxIter) {
			return it;
		}
		return 0;
	}

	public void computeMap() {
		int[] result = new int[di * dj];
		for (int i = 0; i < di; i++) {
			for (int j = 0; j < dj; j++) {
				result[j * di + i] = mand(x + dxdi * i, y + dydj * j);
			}
		}
		map = result;
	}

	public int[] getMap() {
		return map;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int getDi() {
		return di;
	}

	public int getDj() {
		return dj;
	}

	public int getMaxIter() {
		return maxIter;
	}

	public double getDxdi() {
		return dxdi;
	}

	public double getDydj() {
		return dydj;
	}
}