package zlx.mapper;

import zlx.pojo.User;

public interface UserMapper {
    public User selectUserByUsername(String username, String password);
    public void insertUserInfo(User user);
    public Integer countUserByUserName(String username);
}
