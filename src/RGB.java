public class RGB {
	
	private int R_value, G_value, B_value;
	
	public RGB() {
		R_value = 255;
		G_value = 255;
		B_value = 255;
	}
	
	public RGB(int R_value, int G_value, int B_value) {
		this.R_value = R_value;
		this.G_value = G_value;
		this.B_value = B_value;
	}

	public int getR_value() {
		return R_value;
	}

	public void setR_value(int R_value) {
		this.R_value = R_value;
	}

	public int getG_value() {
		return G_value;
	}

	public void setG_value(int G_value) {
		this.G_value = G_value;
	}

	public int getB_value() {
		return B_value;
	}

	public void setB_value(int B_value) {
		this.B_value = B_value;
	}
	
	public String toString() {
		return this.getClass().getName();
	}
}
