#!/bin/bash

# Java 9-21 Features Demo - Run Script

echo "Building project with Maven..."
mvn clean package -q

if [ $? -eq 0 ]; then
    echo "Build successful!"
    echo ""
    echo "Running demo..."
    echo ""
    java --enable-preview -jar target/java-features-demo-1.0.0.jar
else
    echo "Build failed!"
    exit 1
fi
