# 1. Maven Dependencies

```
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.8.1</version>
    <scope>test</scope>
</dependency>
```

# 2. Architecture

## 2.1 JUnit Platform

The platform is responsible for launching testing frameworks on the JVM. It defines a stable and powerful interface between JUnit and its clients, such as build tools.

## 2.2 JUnit Jupiter

- @TestFactory – denotes a method that's a test factory for dynamic tests
- @DisplayName – defines a custom display name for a test class or a test method
- @Nested – denotes that the annotated class is a nested, non-static test class
- @Tag – declares tags for filtering tests
- @ExtendWith – registers custom extensions
- @BeforeEach – denotes that the annotated method will be executed before each test method (previously @Before)
- @AfterEach – denotes that the annotated method will be executed after each test method (previously @After)
- @BeforeAll – denotes that the annotated method will be executed before all test methods in the current class (previously @BeforeClass)
- @AfterAll – denotes that the annotated method will be executed after all test methods in the current class (previously @AfterClass)
- @Disable – disables a test class or method (previously @Ignore)

# 3. Basic Annotations 

## 3.1 @BeforeAll and @BeforeEach

```
@BeforeAll
static void setup() {
    log.info("@BeforeAll - executes once before all test methods in this class");
}

@BeforeEach
void init() {
    log.info("@BeforeEach - executes before each test method in this class");
}
```

## 3.2 @DisplayName and @Disabled

```
@DisplayName("Single test successful")
@Test
void testSingleSuccessTest() {
    log.info("Success");
}

@Test
@Disabled("Not implemented yet")
void testShowSomething() {
}
```

## 3.3 @AfterEach and @AfterEach
```
@AfterEach
void tearDown() {
    log.info("@AfterEach - executed after each test method.");
}

@AfterAll
static void done() {
    log.info("@AfterAll - executed after all test methods.");
}
```

# 4. Assertions and Assumptions

## 4.1 Assertions 

Method 1 :
```
@Test
void lambdaExpressions() {
    List numbers = Arrays.asList(1, 2, 3);
    assertTrue(numbers.stream()
      .mapToInt(Integer::intValue)
      .sum() > 5, () -> "Sum should be greater than 5");
}
```

Method 2: It's also now possible to group assertions with assertAll(), which will report any failed assertions within the group with a MultipleFailuresError:


```
@Test
 void groupAssertions() {
     int[] numbers = {0, 1, 2, 3, 4};
     assertAll("numbers",
         () -> assertEquals(numbers[0], 1),
         () -> assertEquals(numbers[3], 3),
         () -> assertEquals(numbers[4], 1)
     );
 }
```

# 4.2 Assumptions 

Assumptions are used to run tests only if certain conditions are met. This is typically used for external conditions that are required for the test to run properly, but which aren't directly related to whatever is being tested.


```
@Test
void trueAssumption() {
    assumeTrue(5 > 1);
    assertEquals(5 + 2, 7);
}

@Test
void falseAssumption() {
    assumeFalse(5 < 1);
    assertEquals(5 + 2, 7);
}

@Test
void assumptionThat() {
    String someString = "Just a string";
    assumingThat(
        someString.equals("Just a string"),
        () -> assertEquals(2 + 2, 4)
    );
}
```


