package Common;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.internal.annotations.ITest;


public class RetryListener implements IAnnotationTransformer
{
	public void transform(ITest annotation, Class testClass,
		      Constructor testConstructor, Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryFailedTest.class);
	}

}
