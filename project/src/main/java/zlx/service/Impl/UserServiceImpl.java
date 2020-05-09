package zlx.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zlx.mapper.UserMapper;
import zlx.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;
    @Override
    public Integer countUserByUserName(String username) {
        Integer count = um.countUserByUserName(username);
        if (count ==0){
            throw new RuntimeException("用户不存在！");
        }else
        return count;
    }
}
