package listTask2;

import java.util.ArrayList;

public class UserService {
    ArrayList<UserVO> userList = new ArrayList<>();

    // id 중복 검사
    public boolean checkId(String id){
        for(UserVO user : userList){
            if(user.getId().equals(id)){
                return false;
            }
        }
        return true;
    }

    // 회원가입
    public void join(UserVO user){
        userList.add(user);
    }

    // 로그인
    public UserVO login(String id, String pw){
        for(UserVO user : userList){
            if(user.getId().equals(id) && user.getPw().equals(pw)){
                return user;
            }
        }
        return null;
    }
}
