package ru.vsu.cs.zhikhorev_a_a;

import ru.vsu.cs.util.ArrayUtils;

import java.io.PrintStream;
import java.util.List;

public class ConsoleMain {

    public static class CmdParams {
        public String inputFile1;
        public String inputFile2;
        public String outputFile;
        public boolean error;
        public boolean help;
        public boolean window;
    }

    public static CmdParams parseArgs(String[] args) {
        CmdParams params = new CmdParams();
        if (args.length > 0) {
            if (args[0].equals("--help")) {
                params.help = true;
                return params;
            }
            if (args[0].equals("--window")) {
                params.window = true;
                return params;
            }
            if (args.length < 2) {
                params.help = true;
                params.error = true;
                return params;
            }
            params.inputFile1 = args[0];
            params.inputFile2 = args[1];

            if (args.length > 2) {
                params.outputFile = args[2];
            }
        } else {
            params.help = true;
            params.error = true;
        }
        return params;
    }

    public static void main(String[] args) throws Exception {
        ConsoleMain.CmdParams params = parseArgs(args);
        CreatorOfNewList creatorOfNewList = new CreatorOfNewList();
        ListUtils listUtils = new ListUtils();
        if (params.help) {
            PrintStream out = params.error ? System.err : System.out;
            out.println("Usage:");
            out.println("  <cmd> args <input-file1> <input-file2> (<output-file>)");
            out.println("  <cmd> --help");
            out.println("  <cmd> --window  // show window");
            System.exit(params.error ? 1 : 0);
        }

        if (params.window) {
            GUIMain.winMain();
        } else {
            int[] array1 = ArrayUtils.readIntArrayFromFile(params.inputFile1);
            int[] array2 = ArrayUtils.readIntArrayFromFile(params.inputFile2);
            if (array1 == null || array2 == null) {
                System.err.printf("Can't read array from \"%s\"%n", params.inputFile1);
                System.err.printf("Can't read array from \"%s\"%n", params.inputFile2);
                System.exit(2);
            }

            List<Integer> list1 = listUtils.convertArrayToList(array1);
            List<Integer> list2 = listUtils.convertArrayToList(array2);
            List<Integer> resultList = creatorOfNewList.createNewList(list1, list2);
            int[]resultArray = listUtils.convertListToArray(resultList);

            PrintStream out = (params.outputFile != null) ? new PrintStream(params.outputFile) : System.out;
            out.println(ArrayUtils.toString(resultArray));
            out.close();
        }
    }
}