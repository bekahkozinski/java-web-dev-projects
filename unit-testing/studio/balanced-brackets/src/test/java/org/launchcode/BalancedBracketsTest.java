package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true"
                assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }
}