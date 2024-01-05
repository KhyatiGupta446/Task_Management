package TaskManagement.example.services;

import TaskManagement.example.entities.Tasks;

import java.util.List;

public interface TaskService {

    //create
    Tasks createTask(Tasks tasks);

    //update
    Tasks updateTask(Tasks tasks, Integer id);

    //delete
    void deleteTask(Integer id);

    //get All tasks
    List<Tasks> getAllTasks();

    //get single task by id
    Tasks getTaskById(Integer id);
}
