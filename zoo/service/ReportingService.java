package zoo.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportingService implements Exportable {
    @Override
    public boolean export(List<String> data, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String line : data) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("\nRAPORT WYGENEROWANY: " + fileName);
            return true;
        } catch (IOException e) {
            System.err.println("Błąd podczas eksportu raportu: " + e.getMessage());
            return false;
        }
    }
    static String toJSON(ArrayList<String> raport){
        StringBuilder result = new StringBuilder("[\n");
        for (String i : raport) {
            result.append("{\n");
            result.append("action: ").append(i).append("\n");
            result.append("},\n");
        }
        result.append("]\n");
        return result.toString();
    }
}
