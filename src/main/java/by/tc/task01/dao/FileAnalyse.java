package by.tc.task01.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class FileAnalyse {
    public static final String DATABASE = "appliances_db.txt";
    private static final String PROPERTIES_DELIMITER = ",";
    private static final String NAME_VALUE_DELIMITER = "=";
    private static final String DELIMITER = ":";
    private static File file;
    private static BufferedReader reader;
    private static FileReader fileReader;

    public List<String> getLinesFromFile() throws IOException {
        List<String> linesFromFile = new ArrayList<>();
        String filePath = Objects.requireNonNull(getClass().getClassLoader().getResource(DATABASE)).getPath();
        try {
            file = new File(filePath);
            fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);
            String applianceString;
            while ((applianceString = reader.readLine()) != null) {
                if (!applianceString.isEmpty()) {
                    linesFromFile.add(applianceString);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error in getting data from file", e);
        } finally {
            reader.close();
            fileReader.close();
        }
        return linesFromFile;
    }

    public String[] split(String line) {
        return Arrays.stream(line.split(DELIMITER)).map(String::trim).
                toArray(String[]::new);
    }

    public static String[] trimAll(String[] items) {
        return Arrays.stream(items)
                .map(String::trim)
                .toArray(String[]::new);
    }

    public Map<String, Object> findProperties(String property) {
        return Arrays.stream(property.split(PROPERTIES_DELIMITER))
                .map(s -> s.split(NAME_VALUE_DELIMITER))
                .filter(a -> a.length == 2)
                .map(FileAnalyse::trimAll)
                .collect(Collectors.toMap(a -> a[0], a -> a[1]));
    }


    public boolean isInteger(String value) {
        Pattern integerPattern = Pattern.compile("\\d+");
        Matcher integerMatcher = integerPattern.matcher(value);
        boolean result = integerMatcher.matches();
        return result;
    }

    public boolean isDouble(String value) {
        Pattern doublePattern = Pattern.compile("\\d+\\.\\d+");
        Matcher doubleMatcher = doublePattern.matcher(value);
        boolean result = doubleMatcher.matches();
        return result;
    }

    public String getClassName(String line) {
        return split(line)[0];
    }

    public String getProperties(String line) {
        return split(line)[1];
    }
}
