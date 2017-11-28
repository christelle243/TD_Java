#! /bin/sh

mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar \
-Dsonar.host.url=https://sonarcloud.io \
-Dsonar.organization=christelle243-github \
-Dsonar.login=8cc8eaa733ed394cd7e9dbadb0914fe2a68f0bd3
