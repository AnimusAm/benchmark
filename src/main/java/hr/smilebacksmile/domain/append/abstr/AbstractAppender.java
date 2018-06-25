package hr.smilebacksmile.domain.append.abstr;

import hr.smilebacksmile.domain.append.interfaces.Appendable;
import hr.smilebacksmile.domain.util.abstr.RandomAbstractListGenerator;
import hr.smilebacksmile.performance.logging.annotations.LoggablePerformance;

import java.util.List;

public abstract class AbstractAppender<T> implements Appendable{

    protected RandomAbstractListGenerator listGenerator;
    protected List<T> initalList;

    @LoggablePerformance
    public List<T> getInitalList() {
        return initalList;
    }

    public abstract List<T> generateList(final long size);

}
