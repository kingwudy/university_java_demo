package com.liu.SpringTransactionTest;
/**
 * 声明事物使用：基于切面注解的事物管理
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liu.SpringTransaction4.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringTest4 {
	@Autowired
	@Qualifier("accountService")
	private AccountService accountService;
	
	@Test
	public void demo(){
		accountService.transfer("aaa", "bbb", 1000);
	}
}
