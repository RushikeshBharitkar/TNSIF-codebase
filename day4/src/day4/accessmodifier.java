package day4;

public class accessmodifier {
	//public   ex: street light   // any one can use it
	//private   ex: whatsapp       //only we can acess it no other can acess it only inside the class only not outside the class
	//protected  ex: house        // only we and our assets can use it we need to inherit it to acess it it can acess in subclass too
	//default    ex tv            // it can acess in package
	
	
	//private
	//default
	//protected
	//public     ordWer of restriction
	// read acess modifier tables0
	
	// delare default,private ,private,protected and public variables
	
	int vardefault =10;
	public int varpublic =20;
	private int varprivate =12;
	protected int varprotected =30;
	
	//declare default, protected, public private
	
	//this is default
	void methoddefault(){
		System.out.println("default class");
		System.out.println("default class"+vardefault);
	}
	public void methodpublic(){
		System.out.println("public class");
		System.out.println("public class class"+varpublic);
	}
	void methodprivate(){
		System.out.println("private class");
		System.out.println("private class"+varprivate);
	}
	void methodprotected(){
		System.out.println("protected class");
		System.out.println("default class"+varprotected);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
accessmodifier b1= new accessmodifier();
b1.methoddefault();
b1.methodprotected();
b1.methodprivate();
b1.methodpublic();

b1.vardefault=11;
b1.methoddefault();// we can do this to to all expect protcted
	}

}
