package com.MockTest.controller;

import com.MockTest.entity.MockTest;
import com.MockTest.service.MockTestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mocktests")
@CrossOrigin(origins = "http://localhost:3000")
public class MockTestcontroller {

    private final MockTestService service;

    public MockTestcontroller(MockTestService service) {
        this.service = service;
    }

    // Create Mock Test
    @PostMapping
    public MockTest createTest(@RequestBody MockTest mockTest) {
        return service.createTest(mockTest);
    }

    // Get All Tests
    @GetMapping
    public List<MockTest> getAllTests() {
        return service.getAllTests();
    }

    // Get Test By Id
    @GetMapping("/{id}")
    public MockTest getById(@PathVariable Long id) {
        return service.getTestById(id);
    }

    // Update Test
    @PutMapping("/{id}")
    public MockTest updateTest(@PathVariable Long id,
                               @RequestBody MockTest mockTest) {
        return service.updateTest(id, mockTest);
    }

    // Delete Test
    @DeleteMapping("/{id}")
    public String deleteTest(@PathVariable Long id) {
        service.deleteTest(id);
        return "Mock Test Deleted Successfully";
    }
}