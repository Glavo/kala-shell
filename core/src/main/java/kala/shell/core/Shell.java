package kala.shell.core;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class Shell {
    public void run(Terminal terminal) throws Throwable {
        LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();

        String line;
        while (!"exit".equals(line = reader.readLine("> "))) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) throws Throwable {
        // System.setProperty("org.jline.terminal.dumb", "true");

        try (Terminal terminal = TerminalBuilder.builder()
                .system(true)
                .jna(true)
                .build()) {
            new Shell().run(terminal);
        }
    }
}
