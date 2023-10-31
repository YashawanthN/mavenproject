package Common;

import org.testng.ITestResult;
import org.testng.IRetryAnalyzer;

public class RetryFailedTest implements IRetryAnalyzer{
private int retryCount = 0;
private static final int maxRetryCount = 4;

public boolean retry(ITestResult result) {
  if (retryCount < maxRetryCount) {
    retryCount++;
    return true;
  }
  return false;
}
}

