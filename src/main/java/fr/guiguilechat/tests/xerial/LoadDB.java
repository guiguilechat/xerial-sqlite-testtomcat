package fr.guiguilechat.tests.xerial;

import java.sql.DriverManager;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoadDB implements InitializingBean {


	@Override
	public void afterPropertiesSet() throws Exception {
		DriverManager.getConnection("jdbc:sqlite::memory:");
		log.info("succesfuly loaded db");
	}


}
