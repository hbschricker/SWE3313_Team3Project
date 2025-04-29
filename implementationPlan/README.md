# Implementation Plan

Welcome to our Implementation Plan page! Here, you will find the requirements and instructions to run our project on your device and a video demonstration of the website.

### Instructions:
To make our project work you need to have the following on your computer:

* JDK 21 has to be on your computer
* Apache Maven has to be on your computer
* git or git-bash has to be on your computer (if you are on windows)

Steps:
1. Go to an empty folder on your computer.
2. Clone the repository from our repository using the following command:
```
git clone -b main https://github.com/hbschricker/SWE3313_Team3Project.git
```
3. Navigate to the cloned project folder where the pom.xml file is located.
4. Build and run the following command via Maven:
```
mvn clean install -Dmaven.test.skip=true -DskipTests=true spring-boot:run
```
5. Once successfully run, go to the following page:
```
http://localhost:8080/login.html
```

### Implementation Presentation:
Click [here](https://www.loom.com/share/bb024e626a1f4c0eb7fea7fec22935f1?sid=1d9d40b7-14d3-4946-a2cd-aa021194be49) to view our Implementation Presentation.

