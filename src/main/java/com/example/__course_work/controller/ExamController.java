package com.example.__course_work.controller;
    import com.example.__course_work.Question;
    import com.example.__course_work.service.ExaminerService;
    import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/exam")
    public class ExamController {
        private final ExaminerService examinerService;

        public ExamController(ExaminerService examinerService) {
            this.examinerService = examinerService;
        }

        @GetMapping("/questions")
        public List<Question> getQuestions(@RequestParam int amount) {
            return examinerService.getQuestions(amount);
        }
    }