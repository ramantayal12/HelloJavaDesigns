# Hello Java Designs
check 

## 1. Install jenv 

a. install jenv
> $ brew install jenv

b. verify install and paths change
> $ jenv doctor

> $ echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc

> $ echo 'eval "$(jenv init -)"' >> ~/.zshrc

c. add Java environments 
> $ jenv add /Users/raman.tayal/Library/Java/JavaVirtualMachines/corretto-1.8.0_342/Contents/Home
> $ jenv rehash (if JAVA_HOME isn't set in jenv doctor)
> $ exec $SHELL -l (if JAVA_HOME isn't set in jenv doctor)

d. Link managed JDKs 
1. Configure global version
> $ jenv global 1.8

2. Configure local version (per directory)
> $ jenv local 1.8

3. Configure shell instance version
> $ jenv shell 18


Note : Every new mac uses zsh \
Documentation Link : https://www.jenv.be


## 2. Java Home Paths

a. Use command on a terminal shell to figure out where is your Java 1.8 home directory
> $ /usr/libexec/java_home -v 1.8

b. If you just want to find out the home directory of your most recent version of Java, omit the version.
> $ /usr/libexec/java_home

## 3. Optional 

1. Optional.of() vs Optional.ofNullable()
Your question is based on assumption that the code which may throw NullPointerException is worse than the code which may not. This assumption is wrong. If you expect that your foobar is never null due to the program logic, it's much better to use Optional.of(foobar) as you will see a NullPointerException which will indicate that your program has a bug. If you use Optional.ofNullable(foobar) and the foobar happens to be null due to the bug, then your program will silently continue working incorrectly, which may be a bigger disaster. This way an error may occur much later and it would be much harder to understand at which point it went wrong.

## 4. Java Concurrency 

1. Executor 
Executor is an interface that represents an object that executes provided tasks. It depends on the particular implementation (from where the invocation is initiated) if the task should be run on a new or current thread.

2. ExecutorService
ExecutorService is a complete solution for asynchronous processing. It manages an in-memory queue and schedules submitted tasks based on thread availability.

## 5. Generating and Adding New SSH Key

1. Generate the SSH Key
> $ ssh-keygen -t ed25519 -C "your_email@example.com" \
or this \
> $ ssh-keygen -t rsa -b 4096 -C "your_email@example.com" \
2. Now Add the SSH key
>eval "$(ssh-agent -s)" \
3. $ ssh-add -K /Users/you/.ssh/id_rsa   
