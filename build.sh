#!/bin/bash

cd 445hw1/
sudo apt-get update
sudo apt-get install openjdk-17-jdk

gradle build
java -jar build/libs/445hw1.jar
