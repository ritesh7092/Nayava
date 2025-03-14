package com.taskManager.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.taskManager.model.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUserId(Long userId);
    List<Task> findByUserIdAndDueDateBetween(Long userId, LocalDate start, LocalDate end);
    List<Task> findByUserIdAndCategory(Long userId, String category);
}
