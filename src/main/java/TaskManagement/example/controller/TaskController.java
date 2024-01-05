package TaskManagement.example.controller;

import TaskManagement.example.dtos.ApiResponseMessage;
import TaskManagement.example.entities.Tasks;
import TaskManagement.example.services.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskService;

    @PostMapping
    public ResponseEntity<Tasks> createTask(@RequestBody Tasks tasks){
        Tasks task = taskService.createTask(tasks);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tasks> updateTask(@PathVariable Integer id, @RequestBody Tasks tasks){
        Tasks updatedTask = taskService.updateTask(tasks, id);
        return new ResponseEntity<>(updatedTask,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponseMessage> deleteTask(@PathVariable Integer id){
        taskService.deleteTask(id);
        ApiResponseMessage response = ApiResponseMessage.builder().message("Task is deleted successfully !!").success(true).status(HttpStatus.OK).build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Tasks>> getAllTasks(){
        return new ResponseEntity<>(taskService.getAllTasks(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
        public ResponseEntity<Tasks> getTask(@PathVariable Integer id){
        Tasks taskById = taskService.getTaskById(id);
        return new ResponseEntity<>(taskById,HttpStatus.OK);
    }

}
