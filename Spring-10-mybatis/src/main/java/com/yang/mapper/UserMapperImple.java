package com.yang.mapper;

import com.yang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;


//测试类换到实现类;
public class UserMapperImple implements UserMapper{


    //我们所有操作都是以SqlSession执行，现在都使用SqlSessionTemplate;

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
