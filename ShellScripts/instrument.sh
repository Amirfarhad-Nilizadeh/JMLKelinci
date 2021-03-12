#!/bin/sh
: ${Kel=~/kelinci-master} 
: ${OJ=~/tools/openjml}
cd jml
java -jar "$OJ/openjml.jar" -rac -racPreconditionEntry *.java
cd ..
cd src
javac -cp ".:$Kel/instrumentor/build/libs/kelinci.jar" *.java -d ../bin
cd ..
java -jar "$Kel/instrumentor/build/libs/kelinci.jar" -i ./bin -o ./bin-instr
java -cp ./bin-instr/ edu.cmu.sv.kelinci.Kelinci KelinciDriverMain @@

