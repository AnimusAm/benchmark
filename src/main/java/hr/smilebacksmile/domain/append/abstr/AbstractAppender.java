package hr.smilebacksmile.domain.append.abstr;

import java.util.List;
import hr.smilebacksmile.domain.append.interfaces.Appendable;
import hr.smilebacksmile.domain.append.util.abstr.RandomAbstractListGenerator;

public abstract class AbstractAppender<T> implements Appendable{

    protected RandomAbstractListGenerator listGenerator;
    protected List<T> initalList;

    public List<T> getInitalList() {
        return initalList;
    }

    public abstract List<T> generateList();

}
