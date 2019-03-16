public class RGBController {
	public static RGB mixed = new RGB();
	
	public static void wyswietl(RGB rgb) {	
		System.out.print("Składowe barwy '" + rgb.toString() + "': ");
		System.out.print("[" + rgb.getR_value() + ", " + rgb.getG_value() + ", " + rgb.getB_value() + "]\n");
	}
	
	public static void mieszaj(RGB rgb1, RGB rgb2) {	
		int R_value = Math.min(rgb1.getR_value() + rgb2.getR_value(), 255);
		int G_value = Math.min(rgb1.getR_value() + rgb2.getR_value(), 255);
		int B_value = Math.min(rgb1.getR_value() + rgb2.getR_value(), 255);
		
		mixed.setR_value(R_value);
		mixed.setG_value(G_value);
		mixed.setB_value(B_value);
	}

	public static void main(String[] args) {
		RGB white = new RGB();
		RGB red = new RGB(255, 0, 0);
		
		wyswietl(white);
		wyswietl(red);
		
		mieszaj(white, red);
		wyswietl(mixed);
	}
}
