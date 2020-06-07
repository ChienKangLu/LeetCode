package com.leo.lab.solution.java;

import com.leo.lab.question.Question;
import org.junit.Before;

/**
 * @author Leo Lu
 * @since 2020/06/07
 */
public abstract class BaseTest<T extends Question> {

    protected T tested;

    @Before
    public void setUp() {
        tested = initializeTestedSolution();
        if (tested == null) {
            throw new IllegalArgumentException("Please initialize the tested solution before testing");
        }
    }

    /**
     * Initialize tested solution before each test
     */
    abstract protected T initializeTestedSolution();
}
