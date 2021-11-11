package repo;

import java.util.List;

public interface ICrudRepo <R> {

    R create(R obj);
    List<R> getAll();
    R update(R obj);
    void delete(R obj);
}