package bsu.comp.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args){
	var fileLocation = Paths.get("WarAndPeace.txt");
	List<String> allLines = null;
	try {
		allLines = Files.readAllLines(fileLocation)
	}
    }
}
