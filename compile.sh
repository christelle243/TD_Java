#! /bin/bash

cd Bank/src/
rm -rf bin
mkdir -p bin
cd src/
javac main/Main.java -d ../bin
