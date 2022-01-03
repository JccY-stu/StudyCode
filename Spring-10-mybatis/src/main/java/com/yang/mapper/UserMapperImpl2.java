package com.yang.mapper;

import com.yang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{


    /**方式一：
     * 我们所有操作都是以SqlSession执行，现在都使用SqlSessionTemplate;
        private SqlSessionTemplate sqlSession;
        public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }*/
    //方式二：可以不用注入SqlSessionTemplate,继承SqlSessionDaoSupport类后直接getSqlSession();
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
