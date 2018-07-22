package hr.smilebacksmile.domain.append.abstr;

import hr.smilebacksmile.domain.append.interfaces.Appendable;
import hr.smilebacksmile.domain.append.interfaces.ListOperable;
import hr.smilebacksmile.domain.util.abstr.RandomAbstractListGenerator;
import hr.smilebacksmile.performance.logging.annotations.LoggablePerformance;

import java.util.List;

public abstract class AbstractListAppender<T> implements Appendable, ListOperable<T> {

    protected RandomAbstractListGenerator listGenerator;
    protected List<T> innerList;

    public abstract List<T> generateList(final long size);

    @Override
    public List<T> getList() {
        return innerList;
    }

    @Override
    public void setList(final List<T> list) {
        innerList = list;
    }
}
