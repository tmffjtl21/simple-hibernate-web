package com.tjlee.hibernate;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Servlet Initializer
 * 
 * @ClassName   : ServletInitializer.java
 * @Description : 
 * @Modification Information
 * 
 *    수정일      수정자    수정내용    
 *  —------—  —----  —----------------------
 *  2017. 8. 21.  최현정    최초 생성
 *
 * @author 최현정
 * @since 2017. 8. 21.
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HibernateApplication.class);
	}

}
