package org.baeldung.persistence.dao;

import org.baeldung.persistence.CustomSpringBootIntegrationTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


public class StudentRepoTestcase extends CustomSpringBootIntegrationTest {
	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private Environment env;

	/**
	 * 单元测试中的数据库配置属性从src/test目录下获取
	 * 1. 由于该目录下的数据库连接属性指向了H2内存数据库
	 * 	  此处理应获得H2数据库的连接属性值
	 * 2. 如果src/test目录下的属性文件对应值被注释掉
	 *    那么,出现在单元测试里的属性的值就会是null
	 *    系统不会去src/main目录下查找
	 * **/
	@Test
	public void test_is_db_connected_to_h2(){
		String url = env.getProperty("jdbc.url");
		String driverClassName = env.getProperty("jdbc.driverClassName");
		Assert.assertEquals("jdbc:h2:mem:myDb;DB_CLOSE_DELAY=-1", url);
		Assert.assertEquals("org.h2.Driver", driverClassName);
	}

	@Test
	public void test_student_repo_not_null(){
		Assert.assertNotNull(studentRepo);
	}
}
