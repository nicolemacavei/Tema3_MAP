package repo;

import java.util.*;

public abstract class InMemoryRepo <R> implements ICrudRepo<R> {

    protected List<R> repoList;

    public InMemoryRepo(){

        this.repoList = new ArrayList<>();
    }

    /**
     * adaug "objectul" in lista
     * @param obj = un "object" nou de tipul T
     * @return "objectul" adaugat
     */
    @Override
    public R create(R obj) {

        this.repoList.add(obj);
        return obj;
    }


    /**
     * returnez toate "objectele" din repo
     * @return lista cu toate "object"-urile
     */
    @Override
    public List<R> getAll() {
        return this.repoList;
    }

    /**
     * sterg un "object" din lista
     * @param obj = "objectul" care trebuie sters
     */
    @Override
    public void delete(R obj) {
        this.repoList.remove(obj);
    }
}