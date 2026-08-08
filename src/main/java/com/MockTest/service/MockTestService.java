package com.MockTest.service;




	import com.MockTest.entity.MockTest;
	import java.util.List;

	public interface MockTestService {

	    MockTest createTest(MockTest mockTest);

	    List<MockTest> getAllTests();

	    MockTest getTestById(Long id);

	    MockTest updateTest(Long id, MockTest mockTest);

	    void deleteTest(Long id);
	}
