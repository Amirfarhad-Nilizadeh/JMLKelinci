#!/bin/bash
AFL_I_DONT_CARE_ABOUT_MISSING_CRASHES=1 AFL_SKIP_CPUFREQ=1 /~/kelinci-master/afl-2.52b/afl-fuzz -i in_dir -o fuzzer-out -S afl -t 999999999 /~/kelinci-master/fuzzerside/interface @@
