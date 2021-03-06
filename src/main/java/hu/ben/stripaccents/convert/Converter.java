package hu.ben.stripaccents.convert;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class Converter {

    private static final String pattern = "[^\\p{ASCII}]";

    public void convertFile(File file) {
        List<String> convertedLines = stripAccentedCharacters(file);

        try {
            FileUtils.writeLines(file, StandardCharsets.UTF_8.name(), convertedLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<String> stripAccentedCharacters(File file) {
        List<String> lines = null;
        try {
            lines = FileUtils.readLines(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (lines != null && !lines.isEmpty()) {
            lines = lines
                .stream()
                .map(StringUtils::stripAccents)
                .collect(Collectors.toList());
        }

        return lines;
    }

}
