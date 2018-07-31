package com.test;

import com.bean.Member;
import com.dao.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class  MapperTest {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	SqlSession	sqlSession;
	@Test
		public void testCRUD(){
		//DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
		System.out.println(memberMapper);
		memberMapper.insertSelective(new Member(null,"xiaoshen","123","132@qq.com","12365"));

		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		for (int i=0;i<20;i++ ){
			String mmid = UUID.randomUUID().toString().substring(0, 5) + i;
			mapper.insertSelective(new Member(null,mmid,"123",mmid+"@qq.com",mmid+"123"));
		}
	}

}
