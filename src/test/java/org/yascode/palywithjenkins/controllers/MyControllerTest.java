package org.yascode.palywithjenkins.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MyControllerTest {

    String name = "Yassin";

    @Test
    void greeting() {
        Assertions.assertThat(name).isEqualTo("Yassin");
    }
}