#!/bin/sh
cd kelinci/afl-2.52b
make
cd ..
cd fuzzerside
make
cd ../instrumentor
gradle build
 