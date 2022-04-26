* 자바에서 존재하는 4가지 변수
 1. 지역 변수 (Local Variables)
  • 중괄호 내에서 선언된 변수
   → 지역 변수는 선언한 중괄호 내에서만 유효하다.
 2. 매개 변수 (Parameters)
  • 메소드에 넘겨주는 변수
   → 메소드가 호출될 때 생명이 시작되고, 메소드가 끝나면 소멸된다. (소멸된 메모리는 가비지 컬렉터에 의해서 수거됨) 
 3. 인스턴스 변수 or 멤버 변수 (Instance Variables or Member Variables)
  • 메소드 밖, 클래스 안에 선언된 변수
   → 객체가 생성될 때 생명이 시작되고, 그 객체를 참조하고 있는 다른 객체가 없으면 소멸된다. (참조가 없는 객체는 가비지 컬렉터의 의하여 수거됨)
 4. 클래스 변수 (Class Variables)
  • 인스턴스 변수와 같이 메소드 밖, 클래스 내부에 정의 되지만 선언 할 때 static이라는 예약어가 필요
   → 클래스가 처음 호출될 때 생명이 시작되고, 자바 프로그램이 종료될 때 소멸한다.

* 기본자료형(Primitive data Type) vs 참조 자료형 (Reference data Type)
 • 기본 자료형
  ✓ 정수형 : byte, short, int, long, char
  ✓ 소수형 : float, double
  ✓ 기타 : boolean
 
 • 참조 자료형
  ✓ new를 사용하여 초기화를 한다.