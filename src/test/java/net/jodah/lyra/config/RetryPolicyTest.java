package net.jodah.lyra.config;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

@Test
public class RetryPolicyTest {
  public void emptyPolicyShouldAllowRetries() {
    assertTrue(new RetryPolicy().allowsAttempts());
  }
}
