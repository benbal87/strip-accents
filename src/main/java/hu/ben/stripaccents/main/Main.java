package hu.ben.stripaccents.main;

import hu.ben.stripaccents.convert.Converter;
import hu.ben.stripaccents.util.ValidatorUtil;

public class Main {

    public static void main(String[] arguments) {
        ValidatorUtil.validateArgument(arguments);
        Converter converter = new Converter();
        converter.convertFile(arguments[0]);

        System.out.println("File converting ended.");
    }

}
