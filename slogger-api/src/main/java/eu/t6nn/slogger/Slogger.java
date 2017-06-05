package eu.t6nn.slogger;

public interface Slogger {

    MessageBuilder<?> error();
    MessageBuilder<?> warn();
    MessageBuilder<?> info();
    MessageBuilder<?> debug();
    MessageBuilder<?> trace();

}
