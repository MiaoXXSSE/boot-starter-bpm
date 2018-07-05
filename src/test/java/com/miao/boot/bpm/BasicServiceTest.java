package com.miao.boot.bpm;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicServiceTest {

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Test
    public void testComplete() {
//        repositoryService.createDeployment().addClasspathResource(("bpmn/First.bpmn")).deploy();
        runtimeService.startProcessInstanceByKey("myProcess");
        Task task = taskService.createTaskQuery().singleResult();
        System.out.println("第一个任务办理前查询任务：任务名称：" + task.getName());
        taskService.complete(task.getId());
        task = taskService.createTaskQuery().singleResult();
        System.out.println("第二个任务办理前查询任务：任务名称：" + task.getName());
        taskService.complete(task.getId());
        task = taskService.createTaskQuery().singleResult();
        System.out.println("最后，task：" + task);
    }


}
