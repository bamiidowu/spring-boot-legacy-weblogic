package com.boostrdev.weblogic.legacy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringBootWebLogicLegacyApplication.class, loader=SpringApplicationContextLoader.class)
public class SpringBootWeblogicLegacyApplicationTests {

	@Test
	public void contextLoads() {
	}

}