package com.example.__course_work.service;

import com.example.__course_work.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JavaQuestionService implements QuestionService {
    private List<Question> questions = new ArrayList<>();
    private Random random = new Random();

    @Override
    public void addQuestion(Question question) {
        if (!questions.contains(question)) {
            questions.add(question);
        }
    }

    @Override
    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return new ArrayList<>(questions);
    }

    @Override
    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            throw new IllegalStateException("No questions available");
        }
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }
}
