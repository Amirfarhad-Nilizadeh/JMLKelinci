public class CopyArray {
    //@ requires 0 < a.length && 0 < b.length;
    //@ requires 0 <= iBegin && 0 <= iEnd && iBegin <= iEnd;
    //@ requires iBegin < a.length && iBegin < b.length && iEnd < a.length && iEnd < b.length;
    public static void CopyArray(int[] b, int iBegin, int iEnd, int[] a) { }
}

