package oopsdemo1;
class Language{
	private String s;
	private int version;
	Language(){
		System.out.println("iam a implicit constructor ");
		s="python";
		System.out.println("hello from :"+s);
	
	}
	Language(String lang){
		System.out.println("iam a parameterized constructor");
		this.s=lang;
		System.out.println("hello from :"+s);
	}
	Language(String lang,int ver){
		System.out.println("iam a parameterized constructor");
		this.s=lang;
		this.version=ver;
		System.out.println("hello from :"+s+"V."+ver);
	}
}

public class LanguageDemo {

	public static void main(String[] args) {
		Language l1=new Language();
		Language l2=new Language("ruby");
		Language l3=new Language("bella");
		Language l4=new Language();
		Language l5=new Language("java",2);
	}

}
