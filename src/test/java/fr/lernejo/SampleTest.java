package fr.lernejo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {

    @ParameterizedTest
    @CsvSource({
        "ADD, 42, 35, 77",
        "ADD, -12, 6, -6",
        "MULT, 6, 3, 18",
        "MULT, -5, 6, -30"
    })
    void mult_behave_as_expected(Sample.Operation
                                     test_nature, int a, int
                                     b, int expectedResult) {

        int result = new Sample().op(test_nature, a, b);

        assertThat(result).isEqualTo(expectedResult);

    }
}
