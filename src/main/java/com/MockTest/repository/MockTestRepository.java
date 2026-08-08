package com.MockTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MockTest.entity.MockTest;

public interface MockTestRepository extends JpaRepository<MockTest, Long> {

}
