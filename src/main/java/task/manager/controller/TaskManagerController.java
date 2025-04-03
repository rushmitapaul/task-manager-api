package task.manager.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import task.manager.dto.Task;

@RestController
@RequestMapping("/api/manager")
public class TaskManagerController {

	@PostMapping
	@RequestMapping("/tasks")
	public void createNewTask() {
		
	}
	
	@GetMapping
	@RequestMapping("/tasks/{id}")
	public Task getTaskById() {
		return new Task();
	}
	
	@PutMapping
	@RequestMapping("/tasks/{id}")
	public void putTaskById() {
	}

	@DeleteMapping
	@RequestMapping("/tasks/{id}")
	public void deleteTask() {
	}
}
