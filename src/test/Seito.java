package test;

public class Seito {

	String name;
<<<<<<< HEAD
	String test300;
=======

	String test500;

>>>>>>> branch 'master' of https://github.com/kazi0321/git_test.git
	int tensuu;

	Seito(String name, int tensuu){
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
