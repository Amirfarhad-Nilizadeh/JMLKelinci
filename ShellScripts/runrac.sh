#!/bin/sh
: ${OPENJML=$HOME/~/openjml}
java -classpath ".:$OPENJML/jmlruntime.jar" "$@"
