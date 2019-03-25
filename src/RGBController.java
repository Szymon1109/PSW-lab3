public class RGBController {
	public void show(RGB rgb) {
		System.out.print("Składowe barwy koloru to: ");
		System.out.println(rgb);
	}
	
	public RGB mixed(RGB rgb1, RGB rgb2) {
		RGB newColor = new RGB();
		double R_value = Math.round((rgb1.getR_value() + rgb2.getR_value()) / 2.0);
		double G_value = Math.round((rgb1.getG_value() + rgb2.getG_value()) / 2.0);
		double B_value = Math.round((rgb1.getB_value() + rgb2.getB_value()) / 2.0);
		
		newColor.setR_value((int)R_value);
		newColor.setG_value((int)G_value);
		newColor.setB_value((int)B_value);

		return newColor;
	}
}
