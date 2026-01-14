package ch14_컬렉션.ex04_HashSet;

//이름과 나이가 동일할 경우 Member 객체를 HashSet에 중복 저장하지 않는다.
//Member 클래스를 선언할 때 이름과 나이가 동일하다면
//동일한 해시코드가 리턴되도록 hashCode()를 재정의하고,
//equals() 메서드가 true를 리턴하도록 재정의했기 때문
public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
				
	//hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age==age) ;
		} else {
			return false;
		}
	}
}