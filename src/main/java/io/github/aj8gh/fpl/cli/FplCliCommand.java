package io.github.aj8gh.fpl.cli;

import io.micronaut.configuration.picocli.PicocliRunner;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "fpl-cli",
    description = "...",
    mixinStandardHelpOptions = true)
public class FplCliCommand implements Runnable {

  @Option(names = {"-v", "--verbose"}, description = "Create verbose output.")
  boolean verbose;

  public static void main(String[] args) {
    PicocliRunner.run(FplCliCommand.class, args);
  }

  public void run() {
    if (verbose) {
      System.out.println("Hi!");
    }
  }
}
