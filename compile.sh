#! /bin/bash

cd Bank/src
rm -rf bin
mkdir -p bin 
javac main/Main.java -d ../bin
