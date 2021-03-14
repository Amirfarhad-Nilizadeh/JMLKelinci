#!/bin/sh
: ${Kel=~/kelinci} 
: ${OJ=~/Tool/openjml}
cd jml
java -jar "$OJ/openjml.jar" -rac -racPreconditionEntry *.java
cd ..
mkdir bin
mkdir bin-instr
cd src
javac -cp ".:$Kel/instrumentor/build/libs/kelinci.jar" *.java -d ../bin
cd ..
java -jar "$Kel/instrumentor/build/libs/kelinci.jar" -i ./bin -o ./bin-instr
java -cp ./bin-instr/ edu.cmu.sv.kelinci.Kelinci KelinciDriverMain @@

