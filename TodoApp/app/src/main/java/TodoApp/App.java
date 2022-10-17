package TodoApp;

import controller.ProjectController;
import controller.TaskController;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

public class App {
    public static void main(String[] args) throws SQLException {
        
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        
//        project.setName("Novo Projeto");
//        project.setDescription("Projeto com finalidade de teste");
//        projectController.save(project);

//        project.setId(1);
//        project.setName("Projeto Zero");
//        project.setDescription("Projeto atualizado");
//        projectController.update(project);        

//        project.setName("Projeto Jota");
//        projectController.save(project);

//        projectController.removeById(1);
//        
//        List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos: " + projects.size());
        
        TaskController taskController = new TaskController();
        Task task = new Task();
//        task.setIdProject(2);
//        task.setName("Fazer atividade A");
//        task.setDescription("XYZ");
//        task.setIsCompleted(false);
//        task.setDeadline(new Date());
//        taskController.save(task);
        
//        task.setIdProject(2);
//        task.setName("Atividade C");
//        task.setDescription("Alteração de cadastros");
//        task.setNotes("Cuidado ao realizar a alteração");
//        task.setIsCompleted(true);
//        task.setDeadline(new Date());
//        taskController.save(task);

//        task.setId(2);
//        task.setName("Fazer atividade C");
//        task.setDeadline(new Date());
//        taskController.update(task);
        
//        task.setIdProject(2);
//        task.setName("Outra tarefa qualquer");
//        task.setDeadline(new Date());
//        taskController.save(task);

//        taskController.removeById(3);

//        List<Task> tasks = taskController.getAll(2);
//        System.out.println("Total de tarefas no projeto: " + tasks.size());

    }
}
