package com.tomgregory;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class ASCIIArtGeneratorTest {
    @Test
    public void doesNotThrowException() throws IOException {
        ASCIIArtGenerator.main(new String[]{"Testing"});
    }
}