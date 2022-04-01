package kala.shell.launcher;

import kala.shell.core.Shell;

public class Main {
    public static void main(String[] args) {
        // TODO: Isolate core with classloader

        Shell shell = new Shell();
        shell.run(args);
    }
}
