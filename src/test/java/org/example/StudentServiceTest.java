package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void hasGraduated() {
        StudentService studentService = new StudentServiceImpl();
        assertThat(studentService.hasGraduated()).isFalse();
    }
}