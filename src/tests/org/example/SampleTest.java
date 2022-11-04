package org.example;

import org.example.model.Student;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Friday, 04/11/2022
 */
public class SampleTest {

    @Test
    public void testFinanceRegistration() throws Exception {
        // given
        Student sampleStudent =
                new Student("S13/09426/17",
                        "Chris", "Oti",
                        6,
                        2,
                        BigDecimal.valueOf(200));
        // when
        Boolean hasRegistered = Main.registerForFinance(sampleStudent);

        // then
        assertThat(hasRegistered).isTrue();

    }

    @Test
    public void testFinanceRegistrationFailure() throws Exception {
        // given
        Student sampleStudent =
                new Student("S13/09426/17",
                        "Chris", "Oti",
                        6,
                        2,
                        BigDecimal.valueOf(200));
        // when
        Boolean hasRegistered = Main.registerForFinance(sampleStudent);

        // then
        assertThat(hasRegistered).isFalse();

    }

    @Test
    public void registerFinanceThrowsException() {
        // given
        Student student = null;

        // then
        assertThatThrownBy(() -> Main.registerForFinance(student))
                .isInstanceOf(Exception.class).hasMessage("Student not found");
    }
}
