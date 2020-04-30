package com.ryanbrookepayne.magnolia.templating.functions;

import javax.validation.constraints.NotNull;

public class HelloWorldTemplatingFunctions {

  public static final String FUNCTION_NAME = "hellofn";

  public String sayHello() {
    return "Hello world!";
  }

  public String sayHello(@NotNull int headingLevel) {
    return String.format("<h%1$s>Hello world!</h%1$s>", headingLevel);
  }
}
