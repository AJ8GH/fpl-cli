package io.github.aj8gh.fpl.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class FplCliCommandTest {

  @Test
  void testWithCommandLineOption() throws Exception {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args = new String[] {"-v"};
      PicocliRunner.run(FplCliCommand.class, ctx, args);

      // hello-micronaut-cli
      assertTrue(out.toString().contains("Hi!"));
    }
  }
}
