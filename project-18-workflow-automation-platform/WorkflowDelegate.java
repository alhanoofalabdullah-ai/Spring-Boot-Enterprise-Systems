package com.alhanoof.workflow.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class WorkflowDelegate implements JavaDelegate {

    @Override
    public void execute(
            DelegateExecution execution
    ) {

        System.out.println(
                "Workflow Executed Successfully"
        );
    }
}
