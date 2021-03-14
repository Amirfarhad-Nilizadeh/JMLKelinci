#!/bin/sh
cd afl-2.52b/
make
cd ..
cd kelinci/fuzzerside
make
cd ../instrumentor
gradle build
