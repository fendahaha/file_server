#!/usr/bin/env bash

mvn clean package
nohup java -jar target/file_server-0.0.1-SNAPSHOT.jar > log.txt 2>&1 &