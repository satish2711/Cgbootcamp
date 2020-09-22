package com.cg.otms.service;

import org.springframework.stereotype.Service;

import com.cg.otms.dao.TestDao;
import com.cg.otms.dto.Test;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class TestService {

	@Autowired
	TestDao testdao;
	
	
	
	//Adding Test 
	public Test addTest(Test test)
	{
		return testdao.save(test);
		
	}
	
}
