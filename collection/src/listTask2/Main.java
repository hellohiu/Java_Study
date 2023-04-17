package listTask2;
/*
    [심화 실습]
    UserVO 클래스를 선언한다.
    - 아이디, 비밀번호, 이름, 나이
    - 모든 필드는 private 으로 선언하고 생성자를 통해서만 초기화한다.
    - toString()을 재정의하여 모든 필드의 값을 확인할 수 있도록 한다.
    - 모든 필드의 getter 메소드를 만든다.

    UserService 클래스를 선언한다.
    - 회원정보를 저장할 List 를 private 으로 선언한다.
    - 아이디 중복검사 메소드 정의
    - 회원강비 메소드 정의
    - 로그인 메소드 정의
 */
public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        UserVO user = new UserVO("abc123", "123", "홍길동", "22");

        if(service.checkId(user.getId())){
            service.join(user);
            System.out.println(user);
        }else{
            System.out.println("중복된 아이디가 존재합니다.");
        }

        user = service.login("abc123", "123");
        if(user != null){
            System.out.println(user.getName() + "님 환영합니다.");
        }else{
            System.out.println("로그인에 실패했습니다.");
        }
    }
}
