#!/bin/bash
cd src
javac -cp ".:/home/~/kelinci-master/instrumentor/build/libs/kelinci.jar" *.java -d ../bin
cd ..
java -jar /home/~/kelinci-master/instrumentor/build/libs/kelinci.jar -i ./bin -o ./bin-instr
java -cp ./bin-instr/ edu.cmu.sv.kelinci.Kelinci KelinciDriverMain @@

