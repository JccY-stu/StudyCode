package service;

import com.yang.dao.UserDao;

public class UserServiceImpl implements UserService{
    //业务层调用数据层，组合;
    //用谁放谁;
    private UserDao userDao;
    //利用set实现动态值的注入;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
