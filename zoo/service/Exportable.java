package zoo.service;

import java.util.List;

public interface Exportable {
    boolean export(List<String> data, String fileName);
}