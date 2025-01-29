#!/bin/bash
export JAVA_HOME=/home/geduardo/sft/jdk-21.0.6
export MAVEN_HOME=/home/geduardo/sft/apache-maven-3.8.7
$MAVEN_HOME/bin/mvn -v
$MAVEN_HOME/bin/mvn clean package -Dmaven.test.skip=true

