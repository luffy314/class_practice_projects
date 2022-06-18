package j.day64_functional_interface.homwork;

import java.util.List;

@FunctionalInterface
public interface ListFunction <T, R> {
    R apply(List<T> list);


}




