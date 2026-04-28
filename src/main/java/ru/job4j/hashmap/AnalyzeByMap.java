package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int totalScore = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                count++;
            }
        }
        return (double) totalScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                count++;
            }
            double averageScore = (double) totalScore / count;
            labels.add(new Label(pupil.name(), averageScore));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectMap.entrySet()) {
            labels.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }

        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            labels.add(new Label(pupil.name(), totalScore));
        }
        labels.sort(Comparator.naturalOrder());

        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        List<Label> labels = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectMap.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
