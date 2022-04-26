package 자바의신.chap_8;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(){
        //어떠한 정보도 모르는 경우
    }

    public MemberDTO(String name){
        this.name = name;
    }

    public MemberDTO(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    public MemberDTO(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
