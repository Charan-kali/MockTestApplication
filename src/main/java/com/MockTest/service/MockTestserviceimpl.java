package com.MockTest.service;



import com.MockTest.entity.MockTest;
import com.MockTest.repository.MockTestRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MockTestserviceimpl implements MockTestService {


    private final MockTestRepository repository;


    public MockTestserviceimpl(MockTestRepository repository) {
        this.repository = repository;
    }



    @Override
    public MockTest createTest(MockTest mockTest) {

        return repository.save(mockTest);
    }



    @Override
    public List<MockTest> getAllTests() {

        return repository.findAll();
    }



    @Override
    public MockTest getTestById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                new RuntimeException("Mock Test not found"));
    }



    @Override
    public MockTest updateTest(Long id, MockTest test) {


        MockTest existing =
                repository.findById(id)
                .orElseThrow(() ->
                new RuntimeException("Test not found"));


        existing.setTitle(test.getTitle());
        existing.setDuration(test.getDuration());
        existing.setTotalMarks(test.getTotalMarks());


        return repository.save(existing);
    }



    @Override
    public void deleteTest(Long id) {

        repository.deleteById(id);

    }
}