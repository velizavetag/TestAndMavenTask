package com.endava.javaInternship;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class OperationsOnNumbersTest {

    @InjectMocks
    OperationsOnNumbers on = new OperationsOnNumbers();

    @Mock
    AppProperties appProperties;
    Properties mockProps;



    @Test
    void parseDoubleValue() {
        when(mockProps.getProperty("number2")).thenReturn("245.56");
        Assertions.assertThat(on.parseDoubleValue(mockProps.getProperty("number2"))).isEqualTo(245.56);
    }

    @Test
    void parseIntValue() {
    }

    @Test
    void divideNumbers() {
    }
}