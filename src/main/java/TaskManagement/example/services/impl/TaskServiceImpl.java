package TaskManagement.example.services.impl;

import TaskManagement.example.entities.Tasks;
import TaskManagement.example.exceptions.ResourceNotFoundException;
import TaskManagement.example.repository.TaskRepository;
import TaskManagement.example.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Tasks createTask(Tasks tasks) {
        Tasks newTask = taskRepository.save(tasks);
        return newTask;
    }

    @Override
    public Tasks updateTask(Tasks tasks, Integer id) {
        Tasks toBeUpdatedTask = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found with given id"));
        toBeUpdatedTask.setTitle(tasks.getTitle());
        toBeUpdatedTask.setDescription(tasks.getDescription());
        toBeUpdatedTask.setStartDate(tasks.getStartDate());
        toBeUpdatedTask.setCompletionDate(tasks.getCompletionDate());

        Tasks savedTask = taskRepository.save(toBeUpdatedTask);
        return savedTask;
    }

    @Override
    public void deleteTask(Integer id) {
        Tasks task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found with given id"));
        taskRepository.delete(task);
    }

    @Override
    public List<Tasks> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Tasks getTaskById(Integer id) {
        Tasks task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found with given id"));
        return task;
    }
}
