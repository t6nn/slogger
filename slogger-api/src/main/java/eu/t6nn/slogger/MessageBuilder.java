package eu.t6nn.slogger;

import java.util.Map;

public interface MessageBuilder<U> {

    <T> MessageBuilder<T> with(String attribute, T value);

    <T> MessageBuilder<T> with(String attribute, Iterable<T> iterable);

    <T> MessageBuilder<T> with(Map<String, T> map);

    MessageBuilder<U> using(Writer<? super U> writer);

}
