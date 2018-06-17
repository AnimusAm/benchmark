package hr.smilebacksmile.domain.append.interfaces;

import java.util.List;

public interface Appendable<T>{

    void append(List<T> listToAppend);
}
