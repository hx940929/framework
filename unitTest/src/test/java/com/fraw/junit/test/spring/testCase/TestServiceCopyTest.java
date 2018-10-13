package com.fraw.junit.test.spring.testCase;

import com.fraw.junit.test.spring.core.BaseSpringTester;
import com.gfyt.core.bean.entity.core.BaseResult;
import com.gfyt.core.service.test.TestService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <b>功能说明:</b><p>
 * 一些说明写这里
 * </p></br> <b>设计思想、目的:</b><p>
 * 一些说明写这里
 * </p></br><b>设计缺陷: </b>
 * <p>
 * 一些说明写这里
 * </p>
 *
 * @author hanxu
 * @version 1.0
 * @CreateDate 2018-10-13 下午4:50
 * @encode UTF-8
 * @needThreadSave false
 * @webSite <a href="https://www.thesunboy.com">访问开发者个人主页</a>
 * @QQ:940274999
 */
public class TestServiceCopyTest extends BaseSpringTester
{
	private final Logger logger = LoggerFactory.getLogger(TestServiceCopyTest.class);

	@Autowired
	TestService service;

	@Test
	public void test1()
	{
		com.gfyt.core.bean.entity.Test test1 = new com.gfyt.core.bean.entity.Test();
		test1.setId(2);
		BaseResult<com.gfyt.core.bean.entity.Test> testBaseResult = service.queryOneByPrimary(test1);
		com.gfyt.core.bean.entity.Test test = testBaseResult.get();
		logger.info("test1()==>" + test);

	}

	@Test
	public void test2()
	{
		logger.info("test1()==>jjj");
		com.gfyt.core.bean.entity.Test test1 = new com.gfyt.core.bean.entity.Test();
		test1.setId(2);
		BaseResult<com.gfyt.core.bean.entity.Test> testBaseResult = service.queryOneByPrimary(test1);
		com.gfyt.core.bean.entity.Test test = testBaseResult.get();
		logger.info("test1()==>" + test);

	}
}