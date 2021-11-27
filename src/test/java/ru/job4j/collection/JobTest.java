package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscByName = new JobAscByName();
        int rsl = cmpAscByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bugs", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Impl task", 0),
                new Job("Fix bugs", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bugs", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bugs", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorAscNameAndAscPriority() {
        Comparator<Job> cmpAscNameAndAscPriority = new JobAscByName()
                .thenComparing(new JobAscByPriority());
        int rsl = cmpAscNameAndAscPriority.compare(
                new Job("Fix bugs", 0),
                new Job("Fix bugs", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescNameAndDescPriority() {
        Comparator<Job> cmpDescNameAndDescPriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpDescNameAndDescPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bugs", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}