package Solid.interfaces;

public interface AppenderFactory {
    Appender produce(String type, Layout layout);
}
