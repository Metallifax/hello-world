import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This is the test class where you can run tests against your code file.
 */
public class GreeterTest {

    /**
     * Each test method checks a certain aspect of your code to see if it meets the requirements of the exercise.
     * <p>If you're unsure how to run a test in Gradle, check out this article in
     * <a href="https://exercism.org/docs/tracks/java/tests">our Java documentation</a> to learn how.</p>
     * Alternatively, you can use your favourite IDE to run your test automatically, like in
     * <a href="https://www.jetbrains.com/help/idea/work-with-tests-in-gradle.html#run_gradle_test">IntelliJ IDEA</a>.
     */
    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertThat(new Greeter().getGreeting()).isEqualTo("Hello, World!");
    }

}
