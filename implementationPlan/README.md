# Implementation Plan


To make our project work you need to have the following on your computer:

* JDK 21 has to be on your computer
* Apache Maven has to be on your computer
* git or git-bassh has to be on your computer (if you are on windows)

Steps:
1. Go to an empty folder on your computer.
2. Clone the repository from our repository using the following command:
```
git clone -b main https://github.com/hbschricker/SWE3313_Team3Project.git
```
3. Navigate to the cloned project folder.
4. Build and run the following command via Maven:
```
mvn clean install -Dmaven.test.skip=true -DskipTests=true spring-boot:run
```
5. Once successfully  run, go to the following page:
```
http://localhost:8080/
```

