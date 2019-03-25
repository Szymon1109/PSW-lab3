public class RGBController {
	
	public static void wyswietl(RGB rgb) {	
		System.out.print("Składowe barwy '" + rgb.toString() + "': ");
		System.out.print("[" + rgb.getR_value() + ", " + rgb.getG_value() + ", " + rgb.getB_value() + "]\n");
	}
	
	public static void mieszaj(RGB rgb1, RGB rgb2, RGB mixed) {	
		double R_value = Math.round((rgb1.getR_value() + rgb2.getR_value()) / 2.0);
		double G_value = Math.round((rgb1.getG_value() + rgb2.getG_value()) / 2.0);
		double B_value = Math.round((rgb1.getB_value() + rgb2.getB_value()) / 2.0);
		
		mixed.setR_value((int)R_value);
		mixed.setG_value((int)G_value);
		mixed.setB_value((int)B_value);
	}

	public static void main(String[] args) {
		RGB white = new RGB();
		RGB red = new RGB(255, 0, 0);
		RGB mixed = new RGB();
		
		wyswietl(white);
		wyswietl(red);
		
		mieszaj(white, red, mixed);
		wyswietl(mixed);
	}
}
