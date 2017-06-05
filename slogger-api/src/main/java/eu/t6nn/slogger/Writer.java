package eu.t6nn.slogger;

import java.io.OutputStream;

public interface Writer<T> {

    void write(T message, OutputStream messageStream);

}
