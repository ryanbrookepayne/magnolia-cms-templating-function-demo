package com.ryanbrookepayne.magnolia.templating.functions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTemplatingFunctionsTest {

  @InjectMocks private HelloWorldTemplatingFunctions helloWorldTemplatingFunctions;

  @Test
  public void testSayHello() {
    assertThat(helloWorldTemplatingFunctions.sayHello()).isEqualTo("Hello world!");
  }

  @Test
  public void testSayHello_heading() {
    assertThat(helloWorldTemplatingFunctions.sayHello(1)).isEqualTo("<h1>Hello world!</h1>");
  }
}
