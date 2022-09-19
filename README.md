# Hello Java Designs


## 1. Install jenv 

a. install jenv
> $ brew install jenv

b. verify install and paths change
> $ jenv doctor

> $ echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc

> $ echo 'eval "$(jenv init -)"' >> ~/.zshrc

c. add Java environments 
> $ jenv add /Users/raman.tayal/Library/Java/JavaVirtualMachines/corretto-1.8.0_342/Contents/Home

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



