* 자바의 접근 제어자
 • public
  ➢ 누구나 접근할 수 있도록 할 때 사용한다.
 • protected
  ➢ 같은 패키지 내에 있거나 상속받은 경우에만 접근할 수 있다.
 • package-private
  ➢ 아무런 접근 제어자를 적어주지 않을 때이며, package-private라고도 불린다. 같은 패키지 내에 있을 때만 접근할 수 있다.
 • private
  ➢ 해당 클래스 내에서만 접근할 수 있다.
  
  접근 범위 : public > protected > package-private > private  

  접근 제어자 선언할 때 유의점
   ❖ public으로 선언된 클래스가 소스 내에 있다면, 그 소스 파일의 이름은 public인 클래스 이름과 반드시 동일해야만 한다.
