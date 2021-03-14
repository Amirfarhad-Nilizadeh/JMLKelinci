To run Kelinci for each example:  
 
1) Start with the directory that you can see "src," "bin," "bin-instr," and "in_dir". 

2) Open a terminal and run the "instrument.sh". Then, open a new terminal and run "startFuzzing.sh". As explained earlier, you should update directory addresses in both shell scripts with the actual address that Kelinci is installed. (Each script has two locations that you should change the address, which are shown with '~')

3) If everything works correctly, after a short time, the AFL interface will start to discover the program's branches inputs. Also, an output directory will be generated ("fuzzer-out" in this study). The fuzzer will save all (interesting) inputs in a "queue" subdirectory that triggers different program behaviors (discovering new branches). Also, "crashes" and "hangs" subdirectories will contain generated inputs that resulted in a crash or a time-out.

The "LeapYear.java" is a simple program to start.

Result: Kelinci covers each branch with an input. For nontrivial programs, it may cover branches with invalid input.
