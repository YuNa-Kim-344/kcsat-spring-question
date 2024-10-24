package hpclab.kcsatspringquestion.questionGenerator.service;

import hpclab.kcsatspringquestion.questionGenerator.domain.QuestionType;
import hpclab.kcsatspringquestion.questionGenerator.repository.QuestionMemoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;


@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionMemoryRepository questionMemoryRepository;

    @Override
    public String getRandomDefaultDataset() {
        Random random = new Random();
        return questionMemoryRepository.getDefaultDatasets().get(random.nextInt(questionMemoryRepository.getDefaultDatasets().size()));
    }

    @Override
    public String getQuestionDefinition(QuestionType type) {
        return questionMemoryRepository.getQuestionDefinition(type);
    }
}
