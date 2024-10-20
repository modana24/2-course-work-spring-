package com.example.__course_work.service;

import com.example.__course_work.Question;
import org.apache.coyote.BadRequestException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class ExaminerServiceImpl implements ExaminerService {
        private final QuestionService questionService;

        public ExaminerServiceImpl(QuestionService questionService) {
            this.questionService = questionService;
        }

        @Override
        public List<Question> getQuestions(int amount) {
            Set<Question> uniqueQuestions = new HashSet<>();
            while (uniqueQuestions.size() < amount) {
                uniqueQuestions.add(questionService.getRandomQuestion());
                if (uniqueQuestions.size() > questionService.getAllQuestions().size()) {
                    throw new BadRequestException("Not enough unique questions available");
                }
            }
            return List.copyOf(uniqueQuestions);
        }

}
