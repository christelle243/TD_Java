#! /bin/sh

mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent package sonar:sonar \
-Dsonar.host.url=https://sonarcloud.io \
-Dsonar.organization=lhillah-github \
-Dsonar.login=6db0809aea73185218af0144951bbf5152b214e1
