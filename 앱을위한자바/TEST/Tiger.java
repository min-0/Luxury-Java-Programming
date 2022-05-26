package TEST;

import week12.Animal;

public class Tiger extends Animal {
	public Tiger() {
		//this.default_name = "";
		this.protected_name = "protected_name";
		this.public_name = "public_name";
		//this.private_name = "";
		//default와 private은 다른 패키지에서 접근할 수 없음.
	}

}
