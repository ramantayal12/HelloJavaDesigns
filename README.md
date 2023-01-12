# Hello Java Designs

## 1. Optional 

1. Optional.of() vs Optional.ofNullable()
    Your question is based on assumption that the code which may throw NullPointerException is worse than the code which may not. This assumption is wrong. If you expect that your foobar is never null due to the program logic, it's much better to use Optional.of(foobar) as you will see a NullPointerException which will indicate that your program has a bug. If you use Optional.ofNullable(foobar) and the foobar happens to be null due to the bug, then your program will silently continue working incorrectly, which may be a bigger disaster. This way an error may occur much later and it would be much harder to understand at which point it went wrong.

## 2. Java Concurrency 

1. Executor      is an interface that represents an object that executes provided tasks. It depends on the particular implementation (from where the invocation is initiated) if the task should be run on a new or current thread.

2. ExecutorService is a complete solution for asynchronous processing. It manages an in-memory queue and schedules submitted tasks based on thread availability.
