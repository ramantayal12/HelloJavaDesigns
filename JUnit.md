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
