package net.ditto.lettuce.common;

public interface IProxy {
	
	public String localize(String text);
	
	public String format(String text, Object... args);
}
