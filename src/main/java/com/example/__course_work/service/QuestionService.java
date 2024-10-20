package com.example.__course_work.service;

import java.util.List;

public class QuestionService {
        Question addQuestion(String question, String answer);
        Question removeQuestion(String question, String answer);
        List<Question> getAllQuestions(String question, String answer);
        Question getRandomQuestion(String question, String answer);

}
