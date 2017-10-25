@echo off
title testng.xml execution
echo Execute xml
export CLASSPATH=$CLASSPATH:/Users/bmiao/Documents/TESTHELLOWORLD/O2O-page-testing/target/classes
cd /Users/bmiao/Documents/TESTHELLOWORLD/O2O-page-testing/
java org.testng.TestNG testng.xml