To run JMLKelinci for each example:  

1) Open the "KelinciDriverMain.java" in the "src" directory and update the "String address ="~/jml";" with the address of the "jml" directory in your system and save the file.
 
2) Back to the directory that you can see "src," "bin," "bin-instr," "in_dir," and "jml". 

3) Open a terminal and run the "instrument.sh". Then, open a new terminal and run "startFuzzing.sh". As explained earlier, you should update directory addresses in both shell scripts with the actual address that Kelinci is installed. (Each script has two locations that you should change the address, which are shown with '~')

4) If everything works correctly, after a short time, the AFL interface will start to discover the program's branches with valid inputs. Also, an output directory will be generated ("fuzzer-out" in this study). The fuzzer will save all (interesting) valid inputs in a "queue" subdirectory that triggers different program behaviors (discovering new branches). Also, "crashes" and "hangs" subdirectories will contain valid generated inputs that resulted in a crash or a time-out.

The "LeapYear.java" is a simple program to start and find how everything is working. 


Result: JMLKelinci will cover all branches with valid inputs.
