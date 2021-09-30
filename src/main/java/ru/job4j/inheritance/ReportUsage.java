package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        HtmlReport report1 = new HtmlReport();
        JSONReport report2 = new JSONReport();
        String text = report2.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
