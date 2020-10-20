package com.franswaabdelmalek.kata.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({KataJUnitTest.class, DisablingTestsTest.class})
public class AllTestCases {

}