package com.ryanbrookepayne.magnolia.setup;

import com.ryanbrookepayne.magnolia.templating.functions.HelloWorldTemplatingFunctions;
import info.magnolia.module.DefaultModuleVersionHandler;
import info.magnolia.module.InstallContext;
import info.magnolia.module.delta.Task;
import info.magnolia.rendering.module.setup.InstallRendererContextAttributeTask;

import java.util.ArrayList;
import java.util.List;

public class MagnoliaTemplatingFunctionsModuleVersionHandler extends DefaultModuleVersionHandler {

  @Override
  protected List<Task> getStartupTasks(InstallContext installContext) {
    List<Task> tasks = new ArrayList<>();
    tasks.add(
        new InstallRendererContextAttributeTask(
            "rendering",
            "freemarker",
            HelloWorldTemplatingFunctions.FUNCTION_NAME,
            HelloWorldTemplatingFunctions.class.getName()));
    tasks.add(
        new InstallRendererContextAttributeTask(
            "site",
            "site",
            HelloWorldTemplatingFunctions.FUNCTION_NAME,
            HelloWorldTemplatingFunctions.class.getName()));
    return tasks;
  }
}
