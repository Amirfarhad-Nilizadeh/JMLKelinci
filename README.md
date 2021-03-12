# JMLKelinci

<<<<<<< HEAD
JMLKelinci is a tool that runs the AFL fuzzer on Java programs (using Kelinci) that use each program's precondition (written in JML) to bypass invalid generated inputs.
=======
JMLKelinci is a tool that runs the AFL fuzzer on Java programs that
use each program's precondition (written in JML) to bypass invalid generated inputs.
>>>>>>> d3e5e49b38a0b8c4728506fb1a363218eb2e5e97

JMLKelinci has four advantages in comparison with Kelinci:

1. It makes testing more efficient since it catches and bypasses invalid inputs before running the program under test.
2. By avoiding covering branches with invalid inputs, the tool finds bugs with valid inputs. Valid inputs are both more efficient to run and more valuable for demonstrating bugs.
<<<<<<< HEAD
3. The pool of (interesting) tests that will be generated with JMLkelinci consists of valid inputs (except for at most one invalid input). Thus, the genetic algorithm used by Kelinci has an increased probability of generating other valid inputs; this should result in achieving branch coverage of the program under test with valid inputs more efficiently.
4. The initial seed for the fuzzer can be chosen with fewer restrictions. 
=======
3. The initial seed for the fuzzer can be chosen with fewer restrictions. 

Also, 28 examples from the [Java+JML](https://github.com/Amirfarhad-Nilizadeh/Java-JML) dataset used in the NFM paper for running with Kelinci and JMLKelinci are in their corresponding directories. Each program ran 5 times with Kelinci and JMLKelinci; valid generated input tests for each run are collected in a JUnit. 
>>>>>>> d3e5e49b38a0b8c4728506fb1a363218eb2e5e97

Also, 28 examples from the [Java+JML](https://github.com/Amirfarhad-Nilizadeh/Java-JML) dataset used in the TAP's study (under review paper) are available to reproduce the results. Each program ran five times with Kelinci and JMLKelinci; valid generated input tests for each run are collected manually in a JUnit. 

# Installation

This README assumes that both Kelinci and OpenJML are installed in a Linux system, along with Java 8. 

<<<<<<< HEAD
For using JMLKelinci first, two following tools should be installed in a Linux system. (We used Ubuntu 18.4) 
Two following links are available to install them: 
1. [Kelinci](https://github.com/isstac/kelinci), and
2. [OpenJML](https://github.com/OpenJML/OpenJML/releases) with the last release of OpenJML. 
Kelinci is a guided fuzzer, and you should follow all installing instructions.
OpenJML is a tool based on JML that supports runtime assertion checking (RAC). We use the command-line version of OpenJML. Thus, you should only download the "openjml-0.8~.zip" file from the above link and extract it in a directory. 

After installing (extracting) OpenJML, it is necessary to make the "runrac.sh" shell script (which is in the ShellScripts) executable for the Linux system with the following steps.
1. Open the shell script (for example with the "vim runrac" command).
2. Change the address of "OPENJML=$HOME/~" to a directory that OpenJML is installed (extracted) in your system, and save the shell script.
3. run "chmod u+x runrac.sh" to make the shell script executable for your system.

=======
For using JMLKelinci first, two following tools should be installed in a Linux system. 
Two following links are available to install them: 
1. [Kelinci](https://github.com/isstac/kelinci), and
2. [OpenJML](http://www.openjml.org/).

>>>>>>> d3e5e49b38a0b8c4728506fb1a363218eb2e5e97
## Usage

Requirements:

<<<<<<< HEAD
1. Java 8 in a Linux system. (We used Ubuntu 18.4) 
2. Kelinci 
3. OpenJML

Inputs of JMLKelinci: 

1. Java Program Under Test (JPUT).
2. Kelinci's Driver (This driver converts byte streams to JPUT's arguments. Then, it runs RAC to check precondition. If precondition is satsified, then it will run JPUT.
3. Initial seed.
4. JPUT entry method's precondition.
5. JMLDriver (To run the entry method with precondition).

The "JPUT" is the target program. The entry method's precondition can be written manually in JML (or it could be inferred, e.g., by using [Daikon](http://plse.cs.washington.edu/daikon/)). A JMLKelinci driver is needed to convert the generated byte stream of the fuzzer to the type of the program's arguments. The JMLKelinci driver needs a method to run the OpenJML's RAC (see examples in the JMLKelinci evaluation directory). JMLKelinci needs an initial seed that does not make the program crash for starting the fuzzing process.

## Execution Instructions

After installing both [Kelinci](https://github.com/isstac/kelinci) and [OpenJML](http://www.openjml.org/), and make the "runrac.sh" executable for the Linux system follow the following instruction:

**1. Build a driver:** Writing a fuzzer driver is essential for using JMLKelinci (like Kelinci and other similar tools). JMLKelinci's driver converts generated byte streams into the program's argument. Also, the driver calls the RAC to check preconditions. 28 drivers are written for both standard Kelinci and JMLKelinci in each corresponding directory. Look at the LeapYear.java example in the examples directory, which is a simple example. 

**2. Build an entry method and JML precondition:** The program with JML precondition must be prepared by taking out the body of the method called by the driver (to save time by avoiding running the program to check precondition) that is annotated with JML's precondition. (look at JMLKelinci examples, you can find it in the "jml" directory of each program).

**3. Build the JMLDriver:** A JMLDriver is a simple driver that runs the entry method with its precondition. JMLDriver will be called by OpenJML's RAC on the fuzzer side. Then, JMLDriver will call the entry method to check the precondition. 

**4. Before compile and instrument:** Five directories should be created by names "src," "jml," "bin," "bin-instr" and "in_dir". (Look at JMLKelinci examples) 

	`mkdir src; mkdir jml; mkdir bin; mkdir bin-instr; mkdir in_dir`

The "src" directory: Contain the Java program under test and the fuzzer driver. 

The "jml" directory: Contain the entry method (with JML precondition) and JMLDriver.

Compile the entry method and JMLDriver in the "jml" directory ussing following command. Assuming OpenJML is installed in the directory `$OJ`:

	`java -jar $OJ/openjml.jar -rac -racPreconditionEntry *.java`

This command compiles the JMLDriver and entry method with its precondition. It checks the program's precondition. Thus, the "jml" driver has the source and compiled version of the entry method and JMLDriver.

The "bin" directory: Contain the compiled version of the program under test and the fuzzer driver.

The "bin-instr" directory: Contain instrumented bin file of the program under test and the fuzzer driver.

The "in_dir" directory: Contain the initial seed(s) that we will explain later in detail.

**5. Compile and Instrument:**  

To compile and instrument the program under test, follow the below commands. (We assume that JPUT and the fuzzer driver are in the "src" directory, and the compiled version of the entry method and JMLDriver are in the "jml" directory)
First open a terminal in a directory that has "src," "jml," "bin," "bin-instr" and "in_dir" subdirectories. Then, run following commands.

`cd src`
`javac -cp ".:/path/to/JMLkelinci/instrumentor/build/libs/kelinci.jar" *.java -d ../bin`
`cd ..`

Above command compiled programs in the "src" directory, and the destination of the compiled programs are "bin" directory. 

Then, use the below commands to instrument the program for the fuzzing process. Assuming the JARs that the target application depends on are in /path/to/libs/.

`java -jar  /path/to/JMLkelinci/instrumentor/build/libs/kelinci.jar -i ./bin -o ./bin-instr`
`java -cp ./bin-instr/ edu.cmu.sv.kelinci.Kelinci KelinciDriverMain @@`

**6. Initial Seed(s):** You should provide an initial seed in the "in_dir" that fuzzer uses it. The program under test should not go to a crash by using this seed(s). Fuzzer uses this seed(s) in the mutation process to generate new inputs. Please look at examples.

**7. Start the fuzzer server:** To start the fuzzer server open a terminal in a directory that has "src," "jml," "bin," "bin-instr" and "in_dir" subdirectories. The, use the following commands. 

`java -cp bin-instrumented:/path/to/libs/* edu.cmu.sv.kelinci.Kelinci <driver-classname> @@`

Also, the above command used the default port which is define for JMLKelinci and Kelinci (the default port is 7007). Instead of the above command you can specify a port number with the following command (following command selects port 5000) to run several fuzzer in a system with using different ports: 

`java -cp bin-instrumented:/path/to/libs/* edu.cmu.sv.kelinci.Kelinci -port 5000 <driver-classname> @@`

**8. Start fuzzing process:** Open a new terminal in a directory that has "src," "jml," "bin," "bin-instr" and "in_dir" subdirectories. If everything works correct, then JMLKelinci will use AFL with the following command to cover the program's under test branches with valid inputs.

`/path/to/afl/afl-fuzz -i in_dir -o out_dir /path/to/kelinci/fuzzerside/interface [-s servers.txt] @@`

**9. Output:** After a short time, the AFL interface will start to discover program's branches with valid inputs. Also, an output directory will be generated ("fuzzer-out" in this study). The fuzzer will save all (interesting) valid inputs in a "queue" subdirectory that trigger different program behaviors (discovering new branches). Also, "crashes" and "hangs" subdirectories will contain valid generated inputs that resulted in a crash or a time-out. See the [AFL website](http://lcamtuf.coredump.cx/afl/) for more details. 

# Executing Examples
=======
1. Java 8 in a Linux system
2. Kelinci
3. OpenJML

Inputs of JMLKelinci:
1. Java Code
2. Entry Method Precondition
3. Kelinci's Driver
4. Initial seed

The "Java Code" is the target program under test. The entry method's precondition can be written manually in JML (or it could be inferred, e.g., by using [Daikon](http://plse.cs.washington.edu/daikon/)). A Kelinci driver must be written to convert the generated byte stream of Kelinci to the type of the program's arguments. For checking preconditions, the Kelinci driver needs a method to run the OpenJML's RAC (see examples in JMLKelinci directory). Kelinci needs an initial seed that does not make the program crash for starting the fuzzing process. Selecting an initial seed for Kelinci is sometimes tricky (as the seed input must not cause the program to crash), especially if the program's input has a complex structure. However, JMLKelinci does not crash (if the precondition is correct and complete) because it will bypass invalid inputs.

## Running the Tool
>>>>>>> d3e5e49b38a0b8c4728506fb1a363218eb2e5e97

We used 28 programs forom [Java+JML dataset](https://github.com/Amirfarhad-Nilizadeh/Java-JML) and 28 buggy programs from [BuggyJava+JML](https://github.com/Amirfarhad-Nilizadeh/BuggyJavaJML) dataset. 

<<<<<<< HEAD
In these examples, we provide all of the necessary inputs (a Java program under test, entry method with JML preconditions, fuzzer driver, JMLDriver, and initial seed) to cover branches with valid inputs. Also, we provide a ReadMe in each directory example to how to run and reproduce results of these examples. 
In our experimental study, we run each 28 correct programs of Java+JML in the JMLKelinci and Kelinci directory five times, and we manually provide a JUnit for each run based on valid inputs (We took out generated invalid inputs by standard Kelinci). 

We provide two shell scripts with the name "instrument.sh" and "startFuzzing.sh" to run these examples. You should only update the directory address to a location which Kelinci is installed for using these shell scripts (each shell script has two places that should be updated, which are shown with '~' in shell scripts).

To run JMLKelinci examples, first, open the "KelinciDriverMain.java" in the "src" directory and update the "String address ="~/jml";" with the address of "jml" directory in your system and save the file. Then, back to the directory that you can see "src," "bin," "bin-instr," "in_dir" and "jml". Next, run the "instrument.sh" and then open a new terminal and run "startFuzzing.sh". As explained earlier, you should update directory addresses in both shell scripts with the actual address that Kelinci is installed.

To run the Kelinci examples with these shell scripts, open a terminal in a directory that you see "src," "bin" and "bin-instr". Then, 1) run the "instrument.sh" to compile the Java program under test and the fuzzer driver. Also, it will instrument the bytecode to be used with the fuzzer. Also, it starts the fuzzer server with the default port that is 7007 (you can change the port as explained earlier). 2) Open a new terminal and run the "startFuzzing.sh" to start fuzzing and discovering new branches.

After running both shell scripts (for both JMLKelinci and standard Kelinci), you see the "fuzzer-out" directory that will have all generated (interesting) inputs that discover a branch or goes to a crash or time-out, as explained earlier in  Execution Instructions part 9.

For running the buggy version, run the same process as explained for JMLKelinci on buggy programs.

For this study, we used OpenJML v.0.46, but it also works perfectly with the last release (v.0.8.52).

# Architecture

The tool has two main components.

The first is the fuzzer side (Kelinci) that instruments the Java program, generates new inputs, monitors branch coverage, and discovers crashes in the program. Also, Kelinci itself has two parts, which are its Java and C parts. The C part sends the input files generated by AFL to the JAVA part over a TCP connection. It then receives the results and forwards them to AFL. The Java side instruments a target application with AFL style administration, plus a component to communicate with the C side. When executing the instrumented program, this sets up a TCP server and runs the target application in a separate thread for each incoming request. It sends back an exit code (success, timeout, crash, or queue full), plus the gathered path information.

The second component is OpenJML's runtime assertion checker (RAC). The JML RAC bypasses invalid inputs by evaluating the program's precondition. We assume that the JML precondition of the entry method and any necessary constructors are available. There are some tools available that can infer preconditions for JML, like [Daikon](http://plse.cs.washington.edu/daikon/). OpenJML's RAC is called in a separate process after inputs are generated with Kelinci. If the precondition is satisfied, then Kelinci will run and monitor the program under test. Also, if the precondition is not satisfied, Kelinci will generate another input. In JMLKelinci, the process's exit code is queried to determine if the program's precondition was satisfied. 
=======
1. Start from the root directory of Kelinci (which has "bin" and "bin-instr" directories), create a folder with the name "jml", and change to it:

	`mkdir jml; cd jml`

Then, add a version of the program for compiling with JML's RAC in the jml directory. The program in the jml directory must be prepared by taking out the body of the method called by the driver (for avoiding running the program in checking precondition). A JMLDriver should also be written manually, which runs the entry method with its precondition (see examples in JMLKelinci directory).

2. Run OpenJML, assuming it is installed in the directory `$OJ`:

	`java -jar $OJ/openjml.jar -rac -racPreconditionEntry *.java`

This command compiles the JMLDriver and entry method with its precondition. It only checks the program's precondition.

3. Update the Kelinci's driver by adding a method for calling JMLDriver for checking precondition. (Look at examples in JMLKelinci directory that how Kelinci's Driver, JMLDriver, and the added method in the Kelinci's driver are worked together)

4. Follow Kelinci's instructions for running Kelinci. By calling JML's RAC in the Kelinci's driver, it will bypass invalid inputs.

5. The default of Kelinci is set to use port 7007. The instruction to use different ports to run several fuzzers in a system is available in Kelinci's GitHub system.

6. Kelinci has an option for making the process parallel. The instruction for making the process parallel is in Kelinci's GitHub. 

# Architecture

The tool has two main components.

The first is the fuzzer side (Kelinci) that instruments the Java program, generates new inputs, monitors branch coverage, and discovers crashes in the program. Also, Kelinci itself has two parts, which are its Java and C parts. The C part sends the input files generated by AFL to the JAVA part over a TCP connection. It then receives the results and forwards them to AFL. The Java side instruments a target application with AFL style administration, plus a component to communicate with the C side. When executing the instrumented program, this sets up a TCP server and runs the target application in a separate thread for each incoming request. It sends back an exit code (success, timeout, crash, or queue full), plus the gathered path information.

The second component is the OpenJML's runtime assertion checker (RAC). The JML RAC bypasses invalid inputs by evaluating the program's precondition. We assume that the JML precondition of the entry method and any necessary constructors are available. There are some tools available that can infer preconditions for JML, like [Daikon](http://plse.cs.washington.edu/daikon/). OpenJML's RAC is called in a separate process after inputs are generated with Kelinci. If the precondition is satisfied, then Kelinci will run and monitor the program under test. Also, if the precondition is not satisfied, Kelinci will generate another input. In JMLKelinci, the process's exit code is queried to determine if the program's precondition was satisfied. 
>>>>>>> d3e5e49b38a0b8c4728506fb1a363218eb2e5e97
