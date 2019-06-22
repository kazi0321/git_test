package test;

public class Seito2 {

	String name;

	String test501;

	int tensuu;

	Seito2(String name, int tensuu){
		this.name = name;
		this.tensuu = tensuu;
	}

	public void print_name() {
		System.out.println(this.name);
	}

	public void print_tensuu() {
		System.out.println(this.tensuu);
	}

	public char hantei() {
		char hantei;
		if (tensuu >=50) {
			hantei = 'C';
		}else if (tensuu >= 70) {
			hantei = 'B';
		}else if(tensuu >= 80) {
			hantei = 'A';
		}else {
			hantei = 'D';
		}
		return hantei;
	}
}
